package com.carvalho.cleanarch.entrypoint.controller;


import com.carvalho.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import com.carvalho.cleanarch.core.usecase.FindCustomerByIdUseCase;
import com.carvalho.cleanarch.core.usecase.InsertCustomerUseCase;
import com.carvalho.cleanarch.core.usecase.UpdateCustomerByIdUseCase;
import com.carvalho.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import com.carvalho.cleanarch.entrypoint.controller.request.CustomerRequest;
import com.carvalho.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerByIdUseCase updateCustomerByIdUseCase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @Autowired
    private CustomerMapper customerMapper;


    @PostMapping
    private ResponseEntity<Void> insert(CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    private ResponseEntity<CustomerResponse> findById(@PathVariable final UUID id){
        var customer = findCustomerByIdUseCase.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    private ResponseEntity<Void> update(@PathVariable UUID id, @Valid @RequestBody CustomerRequest customerRequest){
        var customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerByIdUseCase.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<Void> delete(@PathVariable UUID id){
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

}
