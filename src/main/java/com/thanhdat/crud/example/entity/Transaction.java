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
@Table(name = "TRANSACTION_TBL")
public class Transaction {
    @Id
    @GeneratedValue
    private int id;
    private String status;
    private int user_id;
    private String userName;
    private String userEmail;
    private String userPhone;
    private String userGender;
    private double amount;
    private String payment;
    private String payment_info;
    private String messenger;

}
