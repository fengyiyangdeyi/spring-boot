package com.lyf.springweb.dao;

import java.util.List;

import com.lyf.springweb.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
