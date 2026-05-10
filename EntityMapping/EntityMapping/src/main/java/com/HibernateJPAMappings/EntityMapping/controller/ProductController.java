package com.HibernateJPAMappings.EntityMapping.controller;

import com.HibernateJPAMappings.EntityMapping.DTO.OrderRequest;
import com.HibernateJPAMappings.EntityMapping.Entity.Customer;
import com.HibernateJPAMappings.EntityMapping.Repository.CustomerRepository;
import com.HibernateJPAMappings.EntityMapping.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;


    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody OrderRequest Request){
        return customerRepository.save(Request.getCustomer());
    }

    @GetMapping("/fetchAllOrders")
    public List<Customer> retrieveOrders(){
        return customerRepository.findAll();
    }

}
