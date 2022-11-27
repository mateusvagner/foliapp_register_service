package com.foliApp.registerservice;

import com.foliApp.registerservice.interfaceAdapter.controller.CustomerController;
import com.foliApp.registerservice.interfaceAdapter.controller.SupplierController;
import com.foliApp.registerservice.web.resource.CustomerResource;
import com.foliApp.registerservice.web.resource.SupplierResource;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/register")
public class FoliAppRegisterService {

    @Inject
    CustomerController customerController;

    @Inject
    SupplierController supplierController;

    @POST
    @Path("/supplier/new")
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    public SupplierResource postNewSupplier(SupplierResource supplierResource) {
        return supplierController.saveSupplier(supplierResource);
    }

    @POST
    @Path("/customer/new")
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerResource postNewCustomer(CustomerResource customerResource) {
        return customerController.saveCustomer(customerResource);
    }
}