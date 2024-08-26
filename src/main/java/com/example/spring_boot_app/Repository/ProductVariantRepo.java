package com.example.spring_boot_app.Repository;

import com.example.spring_boot_app.Model.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariantRepo extends JpaRepository<ProductVariant, Integer> {
}
