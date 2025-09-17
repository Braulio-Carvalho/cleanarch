package com.carvalho.cleanarch.dataprovider;

import com.carvalho.cleanarch.core.dataprovider.UpdateCustomer;
import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.dataprovider.repository.CustomerRepository;
import com.carvalho.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements UpdateCustomer {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
