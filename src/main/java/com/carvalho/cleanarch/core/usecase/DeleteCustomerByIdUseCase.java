package com.carvalho.cleanarch.core.usecase;

import java.util.UUID;

public interface DeleteCustomerByIdUseCase {

    void delete(final UUID id);

}
