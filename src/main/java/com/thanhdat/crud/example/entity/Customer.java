package com.thanhdat.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name = "CUSTOMER_TBL")
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private String gender;
    private String phone;
    private String password;
//    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
//    @JoinColumn(name="cp_fk",referencedColumnName = "id")
//    private List<Product> products = new ArrayList<Product>();
    @CreationTimestamp
    private Date created;
}
