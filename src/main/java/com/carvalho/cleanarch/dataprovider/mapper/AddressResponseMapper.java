package com.carvalho.cleanarch.dataprovider.mapper;

import com.carvalho.cleanarch.core.domain.Address;
import com.carvalho.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

Address toAddress(AddressResponse addressResponse);

}
