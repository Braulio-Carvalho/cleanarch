package com.carvalho.cleanarch.core.usecase.impl;

import com.carvalho.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.carvalho.cleanarch.core.dataprovider.FindCustomerById;
import com.carvalho.cleanarch.core.dataprovider.UpdateCustomer;
import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.core.usecase.UpdateCustomerByIdUseCase;

public class UpdateCustomerByIdUseCaseImpl implements UpdateCustomerByIdUseCase {

    private final FindCustomerById findCustomerById;

    private final FindAddressByZipCode findAddressByZipCode;

    private final UpdateCustomer updateCustomer;

    public UpdateCustomerByIdUseCaseImpl(
            FindCustomerById findCustomerById,
            FindAddressByZipCode findAddressByZipCode,
            UpdateCustomer updateCustomer
        )
    {
        this.findCustomerById = findCustomerById;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }

    @Override
    public void update(Customer customer, String zipCode) {
        findCustomerById.find(customer.getId());
        var address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        updateCustomer.update(customer);
    }
}
