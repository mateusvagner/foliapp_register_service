package com.foliApp.registerservice.mapper;

import com.foliApp.registerservice.data.entity.CustomerEntity;
import com.foliApp.registerservice.web.resource.CustomerResource;

public interface CustomerMapper {

    CustomerEntity fromResourceToEntity(CustomerResource customer);

    CustomerResource fromEntityToResource(CustomerEntity customer);
}
