package com.thanhdat.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "ROLE_TBL")
public class Role {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    public Role(String name) {
        this.name = name;
    }
}
