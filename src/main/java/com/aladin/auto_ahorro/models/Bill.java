package com.aladin.auto_ahorro.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Bill {
    Date date;
    Double amount;
}
