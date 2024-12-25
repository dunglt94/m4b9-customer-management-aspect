package com.example.customermanagementaspect.service;

import com.example.customermanagementaspect.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Override
    public List<Customer> findAll() throws Exception {
        throw new Exception("a dummy exception");
    }

    @Override
    public Customer findById(Long id) throws Exception{
        Customer customer = new Customer();
        if (customer.getName() == null) {
            throw new Exception("customer not found!");
        }
        return customer;
    }

    @Override
    public void save(Customer customer) throws Exception {
        throw new Exception("a dummy save exception");
    }

    @Override
    public void delete(Long id) throws Exception {
        throw new Exception("a dummy delete exception");
    }
}
