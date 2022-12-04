package com.foliApp.registerservice.interfaceAdapter.controller;

import com.foliApp.registerservice.web.resource.SupplierResource;

import java.util.List;

public interface SupplierController {

    SupplierResource saveSupplier(SupplierResource supplier);

    List<SupplierResource> getAllSuppliers();

    SupplierResource getSupplierById(Long id);
}
