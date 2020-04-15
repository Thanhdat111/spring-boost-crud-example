package com.thanhdat.crud.example.reponsitory;

import com.thanhdat.crud.example.dto.OrderRequest;
import com.thanhdat.crud.example.dto.OrderResponse;
import com.thanhdat.crud.example.entity.Customer;
import com.thanhdat.crud.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.thanhdat.crud.example.dto.OrderResponse(c.name,p.name) FROM Customer c join c.products p ")
    public List<OrderResponse> getJoinInformation();
}
