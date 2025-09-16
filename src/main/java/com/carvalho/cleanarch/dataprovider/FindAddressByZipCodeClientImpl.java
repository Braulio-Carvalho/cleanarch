package com.carvalho.cleanarch.dataprovider;

import com.carvalho.cleanarch.core.dataprovider.FindAddressByZipCode;
import com.carvalho.cleanarch.core.domain.Address;
import com.carvalho.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import com.carvalho.cleanarch.dataprovider.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeClientImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
