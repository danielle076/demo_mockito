package com.example.demo_mockito.repository;

import com.example.demo_mockito.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByLastName(String name);
}
