package com.foliApp.registerservice.mapper.impl;

import com.foliApp.registerservice.data.entity.SupplierEntity;
import com.foliApp.registerservice.mapper.SupplierMapper;
import com.foliApp.registerservice.web.resource.SupplierResource;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class StandardSupplierMapper implements SupplierMapper {
    @Override
    public SupplierEntity fromResourceToEntity(SupplierResource supplier) {
        SupplierEntity supplierEntity = new SupplierEntity();
        supplierEntity.setOwnerKeyIdentifier(supplier.getOwnerKeyIdentifier());
        supplierEntity.setName(supplier.getName());
        supplierEntity.setPhone(supplier.getPhone());
        supplierEntity.setEmail(supplier.getEmail());
        supplierEntity.setAddress(supplier.getAddress());
        supplierEntity.setType(supplier.getType());

        return supplierEntity;
    }

    @Override
    public SupplierResource fromEntityToResource(SupplierEntity supplier) {
        SupplierResource supplierResource = new SupplierResource();
        supplierResource.setOwnerKeyIdentifier(supplier.getOwnerKeyIdentifier());
        supplierResource.setId(supplier.getId());
        supplierResource.setName(supplier.getName());
        supplierResource.setPhone(supplier.getPhone());
        supplierResource.setEmail(supplier.getEmail());
        supplierResource.setAddress(supplier.getAddress());
        supplierResource.setType(supplier.getType());

        return supplierResource;
    }
}
