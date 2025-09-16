package com.carvalho.cleanarch.dataprovider;

import com.carvalho.cleanarch.core.dataprovider.InsertCustomer;
import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.dataprovider.repository.CustomerRepository;
import com.carvalho.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.insert(customerEntity);

    }
}
