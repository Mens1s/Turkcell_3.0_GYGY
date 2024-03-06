package com.example.turkcellmarket.services.concretes;

import com.example.turkcellmarket.entities.Supplier;
import com.example.turkcellmarket.repositories.abstracts.SupplierRepository;
import com.example.turkcellmarket.services.abstracts.SupplierService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepository supplierRepository;
    @Override
    public void add(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> getAll() {
        return supplierRepository.findAll();
    }
}
