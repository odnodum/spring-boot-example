package com.ramilkhanov.DAO;

import com.ramilkhanov.customer.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer id);
}
