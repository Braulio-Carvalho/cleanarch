package com.carvalho.cleanarch.entrypoint.controller.mapper;

import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.entrypoint.controller.request.CustomerRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    Customer toCustomer(CustomerRequest customerRequest);

}
