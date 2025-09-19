package com.carvalho.cleanarch.core.usecase;

import com.carvalho.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find(final String id);

}
