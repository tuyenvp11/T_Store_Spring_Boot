package com.example.spring_boot_app.Services;

import com.example.spring_boot_app.Model.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IProductService {
    public List<Product> ListProduct();
    Optional<Product> findProductById(int product_id);
    public Product addProduct(Product add_product);
    public Product updateProduct(Product editProduct);
    public Product deleteProduct(int product_id);
    public List<Product> searchProduct(String keyword);
    Page<Product> getAll(Integer pageNo);
    Page<Product> searchProduct(String keyword, Integer pageNo);

}
