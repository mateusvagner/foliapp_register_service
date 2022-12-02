package com.foliApp.registerservice.interfaceAdapter.controller.impl;

import com.foliApp.registerservice.data.dao.CustomerDao;
import com.foliApp.registerservice.data.entity.CustomerEntity;
import com.foliApp.registerservice.interfaceAdapter.controller.CustomerController;
import com.foliApp.registerservice.mapper.CustomerMapper;
import com.foliApp.registerservice.web.resource.CustomerResource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class StandardCustomerController implements CustomerController {

    @Inject
    CustomerMapper customerMapper;

    @Inject
    CustomerDao customerDao;

    @Override
    public CustomerResource saveCustomer(CustomerResource customer) {
        customerDao.save(customerMapper.fromResourceToEntity(customer));
        return customer;
    }

    @Override
    public List<CustomerResource> getAllCustomers() {
        ArrayList<CustomerResource> customerResources = new ArrayList<>();

        List<CustomerEntity> customerEntities = customerDao.getAll();

        for (CustomerEntity customerEntity : customerEntities) {
            customerResources.add(customerMapper.fromEntityToResource(customerEntity));
        }

        return customerResources;
    }

    @Override
    public CustomerResource getCustomerById(Long id) {
        CustomerEntity entity = customerDao.getById(id);

        return customerMapper.fromEntityToResource(entity);
    }
}
