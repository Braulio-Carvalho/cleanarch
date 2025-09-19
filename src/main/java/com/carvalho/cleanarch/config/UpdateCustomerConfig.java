package com.carvalho.cleanarch.config;

import com.carvalho.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import com.carvalho.cleanarch.dataprovider.FindAddressByZipCodeClientImpl;
import com.carvalho.cleanarch.dataprovider.FindCustomerByIdImpl;
import com.carvalho.cleanarch.dataprovider.UpdateCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCaseImpl updateCustomerByIdUseCase(
            FindCustomerByIdImpl findCustomerById,
            FindAddressByZipCodeClientImpl findAddressByZipCode,
            UpdateCustomerImpl updateCustomer
    ){
        return new UpdateCustomerUseCaseImpl(findCustomerById, findAddressByZipCode, updateCustomer);
    }

}
