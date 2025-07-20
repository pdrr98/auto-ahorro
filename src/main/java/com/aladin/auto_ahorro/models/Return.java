package com.aladin.auto_ahorro.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Return {
    Double transactionsTotalAmount;

    Double transactionsTotalCeiling;

    Double investedAmount;

    Double profits;

    List<SavingsByDates> savingsByDates;
}

@AllArgsConstructor
@NoArgsConstructor
class SavingsByDates {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    Date start;
    Date end;
    Double amount;
}
