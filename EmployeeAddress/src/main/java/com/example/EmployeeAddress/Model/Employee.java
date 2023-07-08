package com.example.EmployeeAddress.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId ;
    @Size(min = 1 , max = 50)
    @Pattern(regexp = "^[A-Z].*$" , message = "First letter of Name must be capital")
    private String firstName ;
    @Size(min = 1 , max = 50)
    private String lastName ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_address_id")
    private Address address ;
}
