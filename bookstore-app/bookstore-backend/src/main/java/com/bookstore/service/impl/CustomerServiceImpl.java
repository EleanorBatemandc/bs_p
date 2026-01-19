package com.bookstore.service.impl;

import com.bookstore.entity.Customer;
import com.bookstore.entity.User;
import com.bookstore.mapper.CustomerMapper;
import com.bookstore.mapper.UserMapper;
import com.bookstore.service.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerMapper customerMapper;
    private final UserMapper userMapper;

    public CustomerServiceImpl(CustomerMapper customerMapper, UserMapper userMapper) {
        this.customerMapper = customerMapper;
        this.userMapper = userMapper;
    }

    @Override
    public List<Customer> list() {
        return customerMapper.findAll();
    }

    @Override
    public long count() {
        return customerMapper.count();
    }

    @Override
    @Transactional
    public Customer register(Customer customer) {
        User user = new User();
        user.setUserRole("customer");
        userMapper.insert(user);

        customer.setUserID(user.getUserID());
        customerMapper.insert(customer);
        return customer;
    }
}
