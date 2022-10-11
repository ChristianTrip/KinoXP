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

}
