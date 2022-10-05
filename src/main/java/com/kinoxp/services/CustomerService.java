package com.kinoxp.services;


import com.kinoxp.dto.CustomerRequest;
import com.kinoxp.dto.CustomerResponse;
import com.kinoxp.entities.Customer;
import com.kinoxp.repositories.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //TODO make in api(controller
    public CustomerResponse addCustomer(CustomerRequest customerRequest){
        //Later you should add error checks --> Missing arguments, email taken etc.

        if(customerRepository.existsById(customerRequest.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Customer with this ID already exist");
        }
        if(customerRepository.existsByEmail(customerRequest.getEmail())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Customer with this Email already exist");
        }

        Customer newCustomer = CustomerRequest.getCustomerEntity(customerRequest);
        newCustomer = customerRepository.save(new Customer());

        return new CustomerResponse(newCustomer, false);
    }

    //TODO make in api(controller
    public List<CustomerResponse> getAllCustomers(){
        List<Customer> customers = customerRepository.findAll();
        List<CustomerResponse> customerResponses = customers
                .stream()
                .map(customer -> new CustomerResponse(customer, true))
                .collect(Collectors.toList());
        return customerResponses;
    }

}
