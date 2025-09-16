package com.carvalho.cleanarch.entrypoint.controller;


import com.carvalho.cleanarch.core.usecase.InsertCustomerUseCase;
import com.carvalho.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.carvalho.cleanarch.entrypoint.controller.request.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;


    @PostMapping
    private ResponseEntity<Void> insert(CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }


}
