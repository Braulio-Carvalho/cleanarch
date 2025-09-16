package com.carvalho.cleanarch.dataprovider.repository.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collation = "customers")
public class CustomerEntity {

    @Id
    private UUID id;
    private String name;
    private AddressEntity address;
    private String cpf;
    private boolean isValidCpf;

}
