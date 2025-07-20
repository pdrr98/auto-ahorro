package com.aladin.auto_ahorro.models;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Bill {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    Date date;
    Double amount;
}
