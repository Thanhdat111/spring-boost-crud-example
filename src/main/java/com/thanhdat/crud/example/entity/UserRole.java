package com.thanhdat.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "USER_ROLE_TBL")
public class UserRole {
    @Id
    @GeneratedValue
    private int id;
    private int userId;
    private int roleId;
}
