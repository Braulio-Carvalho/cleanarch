package com.carvalho.cleanarch.entrypoint.controller.mapper;

import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.carvalho.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {


    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
