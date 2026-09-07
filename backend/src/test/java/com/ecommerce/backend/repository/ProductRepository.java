package com.ecommerce.backend.repository;

import com.ecommerce.backend.entity.product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<product, Long> {
}