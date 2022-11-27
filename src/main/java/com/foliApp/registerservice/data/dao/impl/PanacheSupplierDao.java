package com.foliApp.registerservice.data.dao.impl;

import com.foliApp.registerservice.data.dao.SupplierDao;
import com.foliApp.registerservice.data.entity.SupplierEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.RequestScoped;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
@Transactional
public class PanacheSupplierDao implements SupplierDao, PanacheRepository<SupplierEntity> {

    @Override
    public SupplierEntity save(SupplierEntity supplier) {
        persist(supplier);

        return supplier;
    }

    @Override
    public List<SupplierEntity> getAll() {
        return findAll().list();
    }
}
