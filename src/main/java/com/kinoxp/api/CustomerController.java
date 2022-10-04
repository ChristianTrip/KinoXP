package com.kinoxp.api;


import com.kinoxp.services.CustomerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;



}
