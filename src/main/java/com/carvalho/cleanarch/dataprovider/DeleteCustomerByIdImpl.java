package com.carvalho.cleanarch.dataprovider;

import com.carvalho.cleanarch.core.dataprovider.DeleteCustomerById;
import com.carvalho.cleanarch.dataprovider.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void delete(UUID id) {
        customerRepository.deleteById(String.valueOf(id));
    }
}
