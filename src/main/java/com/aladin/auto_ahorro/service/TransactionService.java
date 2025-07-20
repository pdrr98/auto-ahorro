package com.aladin.auto_ahorro.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.aladin.auto_ahorro.models.Bill;
import com.aladin.auto_ahorro.models.Transaction;

@Service
public class TransactionService {

    public List<Transaction> convertBillsToTransactions(List<Bill> bills) {
        return bills.stream()
                .map(this::mapBillToTransaction)
                .collect(Collectors.toList());
    }

    private Transaction mapBillToTransaction(Bill bill) {
        Double amount = bill.getAmount();
        Double remanent = 100 - (amount % 100);
        Double ceiling = amount + remanent;
        Transaction transaction = new Transaction(bill.getDate(), amount, ceiling, remanent);

        return transaction;
    }
}
