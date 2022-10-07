package com.kinoxp.api;


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

    @GetMapping()
    public List<CustomerResponse> getCustomers(){
        return customerService.getCustomers();
    }

    //TODO er lidt usikker om det er skrevet rigtigt.
    @GetMapping(path = "/{email}")
    public CustomerResponse getCustomer(@PathVariable String email){
        Optional<CustomerResponse> customerResponse = customerService.findByEmail(email);
        if(customerResponse.isPresent()){
            return customerResponse.get();
        }else {
            return null;
        }
    }

    //TODO Service er ikke lavet.
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public CustomerResponse createCustomer(@RequestBody CustomerResponse customerResponse){
        System.out.println(customerResponse.getEmail() + customerResponse.getPhone());
        return customerService.save(customerService);
    }

}
