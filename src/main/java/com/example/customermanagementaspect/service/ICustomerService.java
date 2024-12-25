package com.example.customermanagementaspect.service;

import com.example.customermanagementaspect.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll() throws Exception;

    Customer findById(Long id) throws Exception;

    void save(Customer customer) throws Exception;

    void delete(Long id) throws Exception;
}
