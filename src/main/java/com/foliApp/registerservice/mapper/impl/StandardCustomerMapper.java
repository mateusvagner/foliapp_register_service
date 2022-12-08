package com.foliApp.registerservice.mapper.impl;

import com.foliApp.registerservice.data.entity.CustomerEntity;
import com.foliApp.registerservice.mapper.CustomerMapper;
import com.foliApp.registerservice.web.resource.CustomerResource;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class StandardCustomerMapper implements CustomerMapper {

    @Override
    public CustomerEntity fromResourceToEntity(CustomerResource customer) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setOwnerKeyIdentifier(customer.getOwnerKeyIdentifier());
        customerEntity.setName(customer.getName());
        customerEntity.setPhone(customer.getPhone());
        customerEntity.setEmail(customer.getEmail());
        customerEntity.setAddress(customer.getAddress());

        return customerEntity;
    }

    @Override
    public CustomerResource fromEntityToResource(CustomerEntity customer) {
        CustomerResource customerResource = new CustomerResource();
        customerResource.setOwnerKeyIdentifier(customer.getOwnerKeyIdentifier());
        customerResource.setId(customer.getId());
        customerResource.setName(customer.getName());
        customerResource.setPhone(customer.getPhone());
        customerResource.setEmail(customer.getEmail());
        customerResource.setAddress(customer.getAddress());

        return customerResource;
    }
}
