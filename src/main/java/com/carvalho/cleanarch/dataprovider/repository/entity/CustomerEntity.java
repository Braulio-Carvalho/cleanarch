package com.carvalho.cleanarch.dataprovider.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {

    @Id
    private String id;
    private String name;
    private AddressEntity address;
    private String cpf;
    private Boolean validCpf;

}
