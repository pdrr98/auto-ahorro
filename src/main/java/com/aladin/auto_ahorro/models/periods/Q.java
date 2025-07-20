package com.aladin.auto_ahorro.models.periods;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Q {
    Double fixed;
    Date start;
    Date end;
}
