package com.example.EmployeeAddress.Repository;

import com.example.EmployeeAddress.Model.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends CrudRepository<Address , Long> {
}
