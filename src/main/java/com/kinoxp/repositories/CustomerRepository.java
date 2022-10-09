package com.kinoxp.repositories;

import com.kinoxp.dto.CustomerResponse;
import com.kinoxp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Optional<Customer> findByEmail(String email);
}
