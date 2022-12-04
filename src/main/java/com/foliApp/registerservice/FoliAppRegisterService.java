package com.foliApp.registerservice;

import com.foliApp.registerservice.interfaceAdapter.controller.CustomerController;
import com.foliApp.registerservice.interfaceAdapter.controller.SupplierController;
import com.foliApp.registerservice.web.resource.CustomerResource;
import com.foliApp.registerservice.web.resource.SupplierResource;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

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

    @GET
    @Path("/supplier/{id}")
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public SupplierResource getSupplierById(@PathParam("id") String id) {
        return supplierController.getSupplierById(Long.parseLong(id));
    }

    @GET
    @Path("/supplier/all")
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public List<SupplierResource> getAllSuppliers() {
        return supplierController.getAllSuppliers();
    }

    @POST
    @Path("/customer/new")
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    public CustomerResource postNewCustomer(CustomerResource customerResource) {
        return customerController.saveCustomer(customerResource);
    }

    @GET
    @Path("/customer/{id}")
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public CustomerResource getCustomerById(@PathParam("id") String id) {
        return customerController.getCustomerById(Long.parseLong(id));
    }

    @GET
    @Path("/customer/all")
    @RolesAllowed("USER")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.TEXT_PLAIN)
    public List<CustomerResource> getAllCustomers() {
        return customerController.getAllCustomers();
    }
}
