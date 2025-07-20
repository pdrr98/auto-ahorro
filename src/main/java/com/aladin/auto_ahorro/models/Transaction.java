package com.aladin.auto_ahorro.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    Date date;
    @JsonFormat
    Double amount;
    @JsonFormat
    Double ceiling;
    @JsonFormat
    Double remanent;
}
