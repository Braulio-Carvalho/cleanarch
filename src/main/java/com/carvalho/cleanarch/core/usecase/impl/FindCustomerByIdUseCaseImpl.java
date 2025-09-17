package com.carvalho.cleanarch.core.usecase.impl;

import com.carvalho.cleanarch.core.dataprovider.FindCustomerById;
import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.core.usecase.FindCustomerByIdUseCase;

import java.util.UUID;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById){
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(UUID id) {
        return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found."));
    }
}
