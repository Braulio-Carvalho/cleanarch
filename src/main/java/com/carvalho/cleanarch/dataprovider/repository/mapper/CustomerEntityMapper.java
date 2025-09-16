package com.carvalho.cleanarch.dataprovider.repository.mapper;


import com.carvalho.cleanarch.core.domain.Customer;
import com.carvalho.cleanarch.dataprovider.repository.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}
