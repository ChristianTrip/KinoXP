package com.kinoxp.services;


import com.kinoxp.dto.CustomerResponse;
import com.kinoxp.entities.Customer;
import com.kinoxp.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository =customerRepository;
    }
    public List<CustomerResponse> getAllCustomers(){
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponse> customerResponses = customers
                .stream()
                .map(customer -> new CustomerResponse(customer, true))
                .collect(Collectors.toList());
        return customerResponses;
    }

}
