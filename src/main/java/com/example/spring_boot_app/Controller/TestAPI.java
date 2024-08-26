package com.example.spring_boot_app.Controller;

import com.example.spring_boot_app.Model.Product;
import com.example.spring_boot_app.Repository.DbConnect;
import com.example.spring_boot_app.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class TestAPI {
    @Autowired
    public ProductService productService;
    @GetMapping
    public List<Product> getProducts() {
        return productService.ListProduct();
    }


}
