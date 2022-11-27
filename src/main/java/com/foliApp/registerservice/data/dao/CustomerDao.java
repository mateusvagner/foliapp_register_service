package com.foliApp.registerservice.data.dao;

import com.foliApp.registerservice.data.entity.CustomerEntity;

import java.util.List;

public interface CustomerDao {

    CustomerEntity save(CustomerEntity customer);

    List<CustomerEntity> getAll();
}
