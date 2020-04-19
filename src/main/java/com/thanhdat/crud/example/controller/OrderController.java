package com.thanhdat.crud.example.controller;

import com.thanhdat.crud.example.dto.OrderRequest;
import com.thanhdat.crud.example.dto.OrderResponse;
import com.thanhdat.crud.example.entity.Customer;
import com.thanhdat.crud.example.entity.Product;
import com.thanhdat.crud.example.entity.Role;
import com.thanhdat.crud.example.reponsitory.CustomerRepository;
import com.thanhdat.crud.example.reponsitory.ProductRepository;
import com.thanhdat.crud.example.reponsitory.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }

    @GetMapping("/orders")
    public List<Customer> findAllOrder(){
        return customerRepository.findAll();
    }

//    @GetMapping("/getInfo")
//    public List<OrderResponse> getJoinInformation(){
//        return customerRepository.getJoinInformation();
//    }
    @GetMapping("getRoles/{id}")
    public Set<Role> getRoleFromUser(@PathVariable int id){
        return roleRepository.getRolesFromUser(id);
    }

}
