package com.carvalho.cleanarch.core.usecase;

import com.carvalho.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

    void update(Customer customer, String zipCode);

}
