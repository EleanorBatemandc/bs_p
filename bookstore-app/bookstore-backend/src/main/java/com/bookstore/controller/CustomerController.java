package com.bookstore.controller;

import com.bookstore.dto.CustomerRegisterRequest;
import com.bookstore.entity.Customer;
import com.bookstore.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> list() {
        return customerService.list();
    }

    @GetMapping("/count")
    public Map<String, Object> count() {
        Map<String, Object> result = new HashMap<>();
        result.put("count", customerService.count());
        return result;
    }

    @PostMapping("/register")
    public Customer register(@Valid @RequestBody CustomerRegisterRequest request) {
        Customer customer = new Customer();
        customer.setFirstName(request.getFirstName());
        customer.setLastName(request.getLastName());
        customer.setEmail(request.getEmail());
        customer.setPassword(request.getPassword());
        customer.setAge(request.getAge());
        customer.setNationality(request.getNationality());
        customer.setLanguage(request.getLanguage());
        customer.setReligion(request.getReligion());
        customer.setProfession(request.getProfession());
        customer.setBankcardID(request.getBankcardID());
        return customerService.register(customer);
    }
}
