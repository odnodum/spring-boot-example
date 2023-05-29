package com.ramilkhanov.service;

import com.ramilkhanov.DAO.CustomerDao;
import com.ramilkhanov.customer.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerDataAccessService  implements CustomerDao {

    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer alex = new Customer(
                1,
                "Alex",
                "alex@mail.ru",
                23
        );
        customers.add(alex);
        Customer jasmin = new Customer(
                2,
                "Jasmin",
                "jasmin@mail.ru",
                15
        );
        customers.add(jasmin);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Integer id) {
        return customers.stream().
                filter(c -> c.getId().equals(id))
                .findFirst();
    }

}
