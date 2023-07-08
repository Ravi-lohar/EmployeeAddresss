package com.example.EmployeeAddress.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId ;
    @NotBlank(message = "Street is required")
    private String street ;
    @NotBlank(message = "City  required")
    private String city ;
    @NotBlank(message = "State is required")
    private String state ;
    @NotBlank(message = "zipCode Required")
    private String zipCode ;

}
