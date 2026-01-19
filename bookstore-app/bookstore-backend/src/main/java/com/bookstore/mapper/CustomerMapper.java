package com.bookstore.mapper;

import com.bookstore.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerMapper {
    List<Customer> findAll();
    long count();
    int insert(Customer customer);
}
