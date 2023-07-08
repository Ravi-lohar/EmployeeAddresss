package com.example.EmployeeAddress.Service;


import com.example.EmployeeAddress.Model.Employee;
import com.example.EmployeeAddress.Repository.IEmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo ;
    public Iterable<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee Added Successfully" ;
    }

    @Transactional
    public String updateEmployeeById( Employee employee) {
//        Employee  requiredEmployee = employeeRepo.findById(id).orElse(null);
//        if(requiredEmployee != null){
//            requiredEmployee.setFirstName(employee.getFirstName());
//            requiredEmployee.setLastName(employee.getLastName());
//            employeeRepo.save(requiredEmployee);
//            return "Employee Updated Successfully";
//        }
        Long id = employee.getEmployeeId();
        Employee employee1 = employeeRepo.findById(id).orElse(null) ;
        if(employee1 != null ){
                employeeRepo.save(employee);
            return "employee updated successfully ";}
        return "id Not Found " ;
    }
    @Transactional
    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "Employee Deleted Successfully";
    }
}
