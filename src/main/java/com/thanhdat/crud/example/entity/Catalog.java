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
@Table(name = "CATALOG_TBL")
public class Catalog {
    @Id
    @GeneratedValue
    private  int id;
    private String name;
    private int parent_id;
}
