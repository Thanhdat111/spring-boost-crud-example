package com.thanhdat.crud.example.controller;

import com.thanhdat.crud.example.dto.OrderRequest;
import com.thanhdat.crud.example.dto.OrderResponse;
import com.thanhdat.crud.example.entity.Customer;
import com.thanhdat.crud.example.entity.Product;
import com.thanhdat.crud.example.reponsitory.CustomerRepository;
import com.thanhdat.crud.example.reponsitory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/orders")
    public List<Customer> findAllOrder(){
        return customerRepository.findAll();
    }

    @GetMapping("/getInfo")
    public List<OrderResponse> getJoinInformation(){
        return customerRepository.getJoinInformation();
    }
}
