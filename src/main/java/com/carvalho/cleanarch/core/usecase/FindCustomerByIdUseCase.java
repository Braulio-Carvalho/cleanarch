package com.carvalho.cleanarch.core.usecase;

import com.carvalho.cleanarch.core.domain.Customer;

import java.util.UUID;

public interface FindCustomerByIdUseCase {

    Customer find(final UUID id);

}
