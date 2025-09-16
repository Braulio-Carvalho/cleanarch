package com.carvalho.cleanarch.core.dataprovider;

import com.carvalho.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}
