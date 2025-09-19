package com.carvalho.cleanarch.core.dataprovider;

import com.carvalho.cleanarch.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {

    Optional<Customer> find(String id);

}
