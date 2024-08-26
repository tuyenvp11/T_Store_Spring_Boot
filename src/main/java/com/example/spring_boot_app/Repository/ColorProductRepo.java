package com.example.spring_boot_app.Repository;

import com.example.spring_boot_app.Model.ColorProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorProductRepo extends JpaRepository<ColorProduct, Integer> {
}
