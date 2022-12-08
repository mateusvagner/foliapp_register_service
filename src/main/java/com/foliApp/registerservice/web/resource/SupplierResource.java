package com.foliApp.registerservice.web.resource;

public class SupplierResource {

    private Long id;
    private String ownerKeyIdentifier;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnerKeyIdentifier() {
        return ownerKeyIdentifier;
    }

    public void setOwnerKeyIdentifier(String ownerKeyIdentifier) {
        this.ownerKeyIdentifier = ownerKeyIdentifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
