package com.example.EmployeeAddress.Service;

import com.example.EmployeeAddress.Model.Address;
import com.example.EmployeeAddress.Repository.IAddressRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo ;
    public Iterable<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepo.findById(id);
    }

    public String addAddress(Address address) {
        addressRepo.save(address);
        return "Address Added Suuccessfully";
    }
    @Transactional
    public String updateAddress(Long id , Address address) {

        Optional<Address>  address1 = addressRepo.findById(id);
        if(address1.isPresent()){
            Address address2 = address1.get();
            address2.setStreet(address.getStreet());
            address2.setCity(address.getCity());
            address2.setState(address.getState());
            address2.setZipCode(address.getZipCode());
            addressRepo.save(address2);
            return "Address Updated Successfully";
        }
        else {
            return "id Not found" ;
        }

    }
    @Transactional
    public String deleteAddressById(Long id) {
        addressRepo.deleteById(id);
        return "Address Deleted Successfully" ;
    }
}
