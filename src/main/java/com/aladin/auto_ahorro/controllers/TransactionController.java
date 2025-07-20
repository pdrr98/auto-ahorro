package com.aladin.auto_ahorro.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aladin.auto_ahorro.models.Bill;
import com.aladin.auto_ahorro.models.Transaction;
import com.aladin.auto_ahorro.service.TransactionService;

@RestController
@Controller
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping("/blackrock/challenge/v1/transactions:parse")
    public List<Transaction> getTransactions(@RequestBody List<Bill> billList) {
        return transactionService.convertBillsToTransactions(billList);
    }

    @GetMapping("/blackrock/challenge/v1/transactions:validator")
    public ResponseEntity<Map<String, Object>> getMethodName(@RequestBody Map<String, Object> request) {
        // totalAmountToInvest
        // wage
        // TransactonsList
        return null;
    }

}
