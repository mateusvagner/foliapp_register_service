package com.foliApp.registerservice.data.dao;

import com.foliApp.registerservice.data.entity.SupplierEntity;

import java.util.List;

public interface SupplierDao {

    SupplierEntity save(SupplierEntity supplier);

    List<SupplierEntity> getAll();
}
