package com.aladin.auto_ahorro.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.aladin.auto_ahorro.models.Bill;
import com.aladin.auto_ahorro.models.Transaction;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/blackrock/challenge/v1/transactions")
@Controller
public class TransactionController {

    @GetMapping(":parse")
    public List<Transaction> getTransactions(@RequestBody @Valid List<Bill> billList) {
        for (Bill bill : billList) {

        }
        return null;
    }

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

}
