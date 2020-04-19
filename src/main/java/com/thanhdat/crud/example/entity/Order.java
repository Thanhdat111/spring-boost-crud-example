package com.thanhdat.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "ORDER_TBL")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private int transactionId;
    private int productId;
    private int quantity;
    private double amount;
    private boolean status;

}
