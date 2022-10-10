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

    @GetMapping() //GET the List of Customers. (READ) (User).
    public List<CustomerResponse> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    //TODO er lidt usikker om det er skrevet rigtigt.
    @GetMapping("/{email}") //get a customer by by /1 (READ) (User).
    public CustomerResponse getCustomerByEmail(@PathVariable String email){
        return customerService.getCustomerByEmail(email);
    }

    //TODO Service er ikke lavet.
    @PostMapping("") //CREATE a Customer by email (CREATE) (User).
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerResponse createCustomer(@RequestBody CustomerRequest customerRequest){
        return customerService.createCustomer(customerRequest);
    }

    @PutMapping("/{email}") //UPDATE a Customer by email (UPDATE/EDIT)(User).
    public CustomerResponse editCustomer(@RequestBody CustomerRequest customerRequest, @PathVariable String email){
        return customerService.editCustomer(customerRequest);
    }






}
