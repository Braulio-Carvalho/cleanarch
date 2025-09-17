package com.carvalho.cleanarch.config;

import com.carvalho.cleanarch.core.usecase.impl.UpdateCustomerByIdUseCaseImpl;
import com.carvalho.cleanarch.dataprovider.FindAddressByZipCodeClientImpl;
import com.carvalho.cleanarch.dataprovider.FindCustomerByIdImpl;
import com.carvalho.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerByIdUseCaseImpl updateCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById,
            FindAddressByZipCodeClientImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ){
        return new UpdateCustomerByIdUseCaseImpl(findCustomerById, findAddressByZipCode, updateCustomer);
    }

}
