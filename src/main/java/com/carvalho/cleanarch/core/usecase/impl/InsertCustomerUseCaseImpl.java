package com.carvalho.cleanarch.core.usecase.impl;

import com.carvalho.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.carvalho.cleanarch.core.dataprovider.InsertCustomer;
import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;

    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {

    }
}
