package com.carvalho.cleanarch.config;

import com.carvalho.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.carvalho.cleanarch.dataprovider.FindAddressByZipCodeClientImpl;
import com.carvalho.cleanarch.dataprovider.InsertCustomerImpl;
import com.carvalho.cleanarch.dataprovider.SendCpfForValidationImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeClientImpl findAddressByZipCodeClient,
            InsertCustomerImpl insertCustomer,
            SendCpfForValidationImpl sendCpfForValidation
    ){
         return new InsertCustomerUseCaseImpl(findAddressByZipCodeClient, insertCustomer, sendCpfForValidation);
    }
}
