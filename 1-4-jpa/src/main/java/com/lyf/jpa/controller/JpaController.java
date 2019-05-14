package com.lyf.jpa.controller;

import com.lyf.jpa.dao.CustomerRepository;
import com.lyf.jpa.entity.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: LYF
 * @Date: 2019/5/14 17:13
 */
@RestController
@RequestMapping("jpa")
@Slf4j
public class JpaController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        Customer customer = customerRepository.findById(id).get();
        return customer;
    }
}
