package com.carvalho.cleanarch.core.dataprovider;

import com.carvalho.cleanarch.core.domain.Customer;

import java.util.Optional;
import java.util.UUID;

public interface FindCustomerById {

    Optional<Customer> find(UUID id);

}
