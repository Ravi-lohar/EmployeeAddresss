package com.example.EmployeeAddress.Repository;

import com.example.EmployeeAddress.Model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepo extends CrudRepository<Employee , Long> {

}
