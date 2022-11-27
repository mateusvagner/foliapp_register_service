package com.foliApp.registerservice.data.dao.impl;

import com.foliApp.registerservice.data.dao.CustomerDao;
import com.foliApp.registerservice.data.entity.CustomerEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
@Transactional
public class PanacheCustomerDao implements CustomerDao, PanacheRepository<CustomerEntity> {
    @Override
    public CustomerEntity save(CustomerEntity customer) {
        persist(customer);

        return customer;
    }

    @Override
    public List<CustomerEntity> getAll() {
        return findAll().list();
    }
}
