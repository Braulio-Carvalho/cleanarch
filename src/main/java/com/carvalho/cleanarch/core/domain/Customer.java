package com.carvalho.cleanarch.core.domain;

public class Customer {

    public Customer(String id, String name, String cpf, Address address, Boolean validCpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.validCpf = validCpf;
    }

    public Customer() {
        this.validCpf = false;
    }

    private String id;

    private String name;

    private String cpf;

    private Address address;

    private Boolean validCpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return validCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        this.validCpf = validCpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
