package com.example.EmployeeAddress.Controller;

import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Validated
public class EmployeeController {
    @Autowired
    EmployeeService employeeService ;
    @GetMapping("employees")
    public Iterable<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("employee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
    @PostMapping("employee")
    public String addEmployee(@Valid @RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }
    @PutMapping("employee")
    public String updateEmployeeById( @Valid @RequestBody Employee employee){
        return employeeService.updateEmployeeById( employee) ;
    }
    @DeleteMapping("employee/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
}
