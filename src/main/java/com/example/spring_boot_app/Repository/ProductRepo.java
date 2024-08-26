package com.example.spring_boot_app.Repository;

import com.example.spring_boot_app.Model.Category;
import com.example.spring_boot_app.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    @Query("SELECT c FROM Product c WHERE c.product_name LIKE %?1%")
    List<Product> searchProduct(String keyword);
}
