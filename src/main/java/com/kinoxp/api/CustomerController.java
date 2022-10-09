package com.kinoxp.api;


import com.kinoxp.dto.CustomerRequest;
import com.kinoxp.dto.CustomerResponse;
import com.kinoxp.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin

@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping() //--GET LIST OF ALL CUSTOMERS.
    public List<CustomerResponse> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    //TODO er lidt usikker om det er skrevet rigtigt.
    @GetMapping("/{email}") //--GET A SINGLE CUSTOMER BY EMAIL
    public CustomerResponse getCustomerByEmail(@PathVariable String email){
        return customerService.getCustomerByEmail(email);
    }

    //TODO Service er ikke lavet.
    @PostMapping("") //-- CREATE.
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerResponse createCustomer(@RequestBody CustomerRequest customerRequest){
        return customerService.createCustomer(customerRequest);
    }






}
