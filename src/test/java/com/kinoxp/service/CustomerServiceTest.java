package com.kinoxp.service;

import com.kinoxp.dto.CustomerRequest;
import com.kinoxp.dto.CustomerResponse;
import com.kinoxp.entities.Customer;
import com.kinoxp.repositories.CustomerRepository;
import com.kinoxp.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Mock
    CustomerRepository customerRepository;

    @Autowired
    CustomerService customerService;

    @BeforeEach
    public void setup() {
        customerService = new CustomerService(customerRepository);
    }

    @Test
    public void getCustomers() {
        Mockito.when(customerRepository.findAll()).thenReturn(List.of(
                new Customer("Anders", "13124295", "anders@hotmail.com"),
                new Customer("Peter", "15129514", "peter@hotmail.com")
        ));
        List<CustomerResponse> customers = customerService.getAllCustomers();
        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() throws Exception {
        Customer c = new Customer("Peter", "15129514", "peter@hotmail.com");
        Mockito.when(customerRepository.findById("peter@hotmail.com")).thenReturn(Optional.of(c));

        CustomerResponse response = customerService.getCustomer("peter@hotmail.com");
        assertEquals("15129514",response.getPhone());
    }

    @Test
    void addCustomer() throws Exception {
        Customer c = new Customer("Anders", "13124295", "anders@hotmail.com");
        Mockito.when(customerRepository.save(any(Customer.class))).thenReturn(c);
        CustomerRequest request = new CustomerRequest(c);
        CustomerResponse found = customerService.createCustomer(request);
        assertEquals("Anders", found.getName());
    }


}




































