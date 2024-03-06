package com.example.turkcellmarket.repositories.abstracts;

import com.example.turkcellmarket.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Integer> {
}
