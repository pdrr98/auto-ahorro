package com.aladin.auto_ahorro.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.util.HashMap;
import java.util.Map;

@RestController
public class PerformanceController {

    @GetMapping("/blackrock/challenge/v1/performance")
    public ResponseEntity<Map<String, Object>> getCustomMetrics() {
        Map<String, Object> metrics = new HashMap<>();

        // Application start date and uptime
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        long startTimeMs = runtimeMXBean.getStartTime(); // JVM start time in milliseconds since epoch
        long uptimeMs = runtimeMXBean.getUptime(); // Total uptime in milliseconds

        // Convert start time to LocalDateTime and format as yyyy-MM-dd
        java.time.LocalDateTime startDateTime = java.time.LocalDateTime.ofInstant(
                java.time.Instant.ofEpochMilli(startTimeMs),
                java.time.ZoneId.systemDefault());
        String startDateFormatted = startDateTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Convert uptime to HH:mm:ss.ms format
        long uptimeSeconds = uptimeMs / 1000;
        int uptimeMillisRemainder = (int) (uptimeMs % 1000);

        long hours = uptimeSeconds / 3600;
        long minutes = (uptimeSeconds % 3600) / 60;
        long seconds = uptimeSeconds % 60;

        String uptimeFormatted = String.format("%02d:%02d:%02d.%02d",
                hours, minutes, seconds, uptimeMillisRemainder / 10); // Convert ms to 2-digit format

        String timeField = startDateFormatted + " " + uptimeFormatted;
        metrics.put("time", timeField);

        // Memory Usage (used heap memory in bytes)
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        long usedHeapMemory = memoryMXBean.getHeapMemoryUsage().getUsed();
        metrics.put("memory", usedHeapMemory);

        // Number of active threads
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        int threadCount = threadMXBean.getThreadCount();
        metrics.put("threads", threadCount);

        return ResponseEntity.ok(metrics);
    }
}
