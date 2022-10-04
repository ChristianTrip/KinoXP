package com.kinoxp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kinoxp.entities.Customer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
//---------------Lombok.
@Getter
@Setter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
//---------------Lombok.

public class CustomerResponse {
    //---------------Fields / attributter.
    private int id;
    private String name;
    private String phone;
    private String email;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime created;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss",shape = JsonFormat.Shape.STRING)
    private LocalDateTime edited;
    //---------------Fields / attributter.

    //---------------Constructor. Vi skal have en fordi vi bruger DTO klasser.
    public CustomerResponse(Customer customer, boolean includeAll ) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        if(includeAll){
            this.created = customer.getCreated();
            this.edited = customer.getEdited();
        }
    }
    //---------------Constructor. Vi skal have en fordi vi bruger DTO klasser.
}
