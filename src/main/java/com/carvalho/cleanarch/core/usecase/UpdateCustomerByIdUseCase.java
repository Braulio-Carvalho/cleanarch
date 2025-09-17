package com.carvalho.cleanarch.core.usecase;

import com.carvalho.cleanarch.core.domain.Customer;

public interface UpdateCustomerByIdUseCase {

    void update(Customer customer, String zipCode);

}
