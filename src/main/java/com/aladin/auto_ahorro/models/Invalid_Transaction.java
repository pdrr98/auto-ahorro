package com.aladin.auto_ahorro.models;

import lombok.Getter;
import lombok.Setter;

public class Invalid_Transaction extends Transaction {
    @Getter
    @Setter
    String message;
}
