package com.aladin.auto_ahorro.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "date")
    Date date;

    @Getter
    @Setter
    @Column(name = "amount")
    Double amount;

    @Getter
    @Setter
    @Column(name = "ceiling")
    Double ceiling;

    @Getter
    @Setter
    @Column(name = "remanent")
    Double remanent;
}
