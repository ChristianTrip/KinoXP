package com.kinoxp.services;


import com.kinoxp.dto.CustomerRequest;
import com.kinoxp.dto.CustomerResponse;
import com.kinoxp.entities.Customer;
import com.kinoxp.repositories.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<CustomerResponse> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customer -> new CustomerResponse(customer,false))
                .collect(Collectors.toList());
    }

    public CustomerResponse getCustomerByEmail(String email) {
        Optional<Customer> customer = customerRepository.findByEmail(email);
       if(customer.isPresent()){
           System.out.println(customer.get().getEmail());
           return new CustomerResponse(customer.get(), false);
       }
       return null;
       }

    public CustomerResponse createCustomer(CustomerRequest customerRequest) {
        Customer customer = new Customer(customerRequest.getName(), customerRequest.getPhone(), customerRequest.getEmail());
        Customer customerDb = customerRepository.save(customer);
        CustomerResponse customerResponse = new CustomerResponse(customerDb, false);
        return customerResponse;


    }
}






/*
    //TODO make in api(controller
    public CustomerResponse getCustomer(CustomerRequest customerRequest){
        //Later you should add error checks --> Missing arguments, email taken etc.
        if(customerRepository.existsByEmail(customerRequest.getEmail())){
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
 */

/*
TODO getAllCustomers() Disse 2 måder kan også bruges.
List<Customer> customers = customerRepository.findAll();

List<CustomerResponse> customerResponses = new ArrayList<>()
for (int i = 0; i < customers.size(); i++) {
cus.add(new CustomerResponse(customers.get(i),false));
}
TODO  createCustomer() Denne måder kan også bruges.
return new CustomerResponse(customerRepository
.save(new Customer(customerRequest.getName(), customerRequest.getPhone(), customerRequest.getEmail())), false);



*/