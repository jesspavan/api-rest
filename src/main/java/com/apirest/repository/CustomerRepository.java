package com.apirest.repository;

import com.apirest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
