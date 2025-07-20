package com.aladin.auto_ahorro.models.periods;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Q {
    @Getter
    @Setter
    Double fixed;

    @Getter
    @Setter
    Date start;

    @Getter
    @Setter
    Date end;
}
