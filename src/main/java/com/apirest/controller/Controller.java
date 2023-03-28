package com.apirest.controller;

import com.apirest.model.Customer;
import com.apirest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class Controller {

    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer postCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
