package com.czh.demo.service;

import com.czh.demo.dao.SupplierMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SupplierServiceImpl {
    @Autowired
    private SupplierMapper supplierMapper;
}
