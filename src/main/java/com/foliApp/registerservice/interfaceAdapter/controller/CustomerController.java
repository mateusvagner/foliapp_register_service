package com.foliApp.registerservice.interfaceAdapter.controller;

import com.foliApp.registerservice.web.resource.CustomerResource;
import com.foliApp.registerservice.web.resource.SupplierResource;

import java.util.List;

public interface CustomerController {

    CustomerResource saveCustomer(CustomerResource customer);

    List<CustomerResource> getAllCustomers();

    CustomerResource getCustomerById(Long id);
}
