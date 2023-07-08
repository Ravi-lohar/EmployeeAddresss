package com.example.EmployeeAddress.Controller;


import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Service.AddressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Validated
public class AddressController {
    @Autowired
    AddressService addressService ;
    @GetMapping("address")
    public Iterable<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @GetMapping("address/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }
    @PostMapping("address")
    public String addAddress(@Valid @RequestBody Address address){
        return addressService.addAddress(address);
    }
    @PutMapping("address/{id}")
    public String updateAddress(@PathVariable Long id ,@Valid @RequestBody Address address){
        return addressService.updateAddress(id , address);
    }
    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }
}
