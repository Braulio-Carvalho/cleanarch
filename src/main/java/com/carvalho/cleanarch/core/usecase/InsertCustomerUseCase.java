package com.carvalho.cleanarch.core.usecase;

import com.carvalho.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {
    void insert(Customer customer, String zipCode);
}
