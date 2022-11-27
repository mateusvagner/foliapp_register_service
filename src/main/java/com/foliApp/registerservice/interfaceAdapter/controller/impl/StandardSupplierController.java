package com.foliApp.registerservice.interfaceAdapter.controller.impl;

import com.foliApp.registerservice.data.dao.SupplierDao;
import com.foliApp.registerservice.data.entity.SupplierEntity;
import com.foliApp.registerservice.interfaceAdapter.controller.SupplierController;
import com.foliApp.registerservice.mapper.SupplierMapper;
import com.foliApp.registerservice.web.resource.SupplierResource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class StandardSupplierController implements SupplierController {

    @Inject
    SupplierMapper supplierMapper;

    @Inject
    SupplierDao supplierDao;

    @Override
    public SupplierResource saveSupplier(SupplierResource supplier) {
        supplierDao.save(supplierMapper.fromResourceToEntity(supplier));
        return supplier;
    }

    @Override
    public List<SupplierResource> getAllSuppliers() {
        ArrayList<SupplierResource> supplierResources = new ArrayList<>();

        List<SupplierEntity> supplierEntities = supplierDao.getAll();

        for (SupplierEntity supplierEntity : supplierEntities) {
            supplierResources.add(supplierMapper.fromEntityToResource(supplierEntity));
        }

        return supplierResources;
    }
}
