package com.bookstore.service;

import com.bookstore.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> list();
    long count();
    Customer register(Customer customer);
}
