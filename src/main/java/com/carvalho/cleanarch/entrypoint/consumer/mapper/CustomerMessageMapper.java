package com.carvalho.cleanarch.entrypoint.consumer.mapper;

import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
