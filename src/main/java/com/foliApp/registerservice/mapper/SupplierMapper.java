package com.foliApp.registerservice.mapper;

import com.foliApp.registerservice.data.entity.SupplierEntity;
import com.foliApp.registerservice.web.resource.SupplierResource;

public interface SupplierMapper {

    SupplierEntity fromResourceToEntity(SupplierResource supplier);

    SupplierResource fromEntityToResource(SupplierEntity supplier);
}
