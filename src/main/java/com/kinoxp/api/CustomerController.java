package com.kinoxp.api;


import com.kinoxp.dto.CustomerResponse;
import com.kinoxp.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin

@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @GetMapping()
    public List<CustomerResponse> getCustomers(){
        return customerService.getCustomers();
    }

    //TODO er lidt usikker om det er skrevet rigtigt.

    @GetMapping(path = "/{email}")
    public CustomerResponse getCustomer(@PathVariable String email) throws Exception{
        CustomerResponse customerResponse = customerService.getCustomer();
        return customerResponse;
    }



}
