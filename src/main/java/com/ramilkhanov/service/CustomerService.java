package com.ramilkhanov.service;

import com.ramilkhanov.DAO.CustomerDao;
import com.ramilkhanov.customer.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDao.selectAllCustomers();
    }
    public Customer getCustomer(Integer id) {
        return customerDao.selectCustomerById(id).orElseThrow(() -> new IllegalArgumentException("customer with id [%s] not found".formatted(id)));
    }

}
