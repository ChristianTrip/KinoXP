package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.kinoxp.entities.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//---------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
//---------------Lombok.

public class CustomerRequest {

   private int id;

   private String name;

   private String phone;

   private String email;


   public CustomerRequest(Customer customer) {
       this.id = customer.getId();
       this.name = customer.getName();
       this.phone = customer.getPhone();
       this.email = customer.getEmail();
   }

   public static Customer getCustomerEntity(CustomerRequest request){
       return new Customer(request.name, request.phone, request.email);
   }

}

