package com.example.spring_boot_app.Services;

import com.example.spring_boot_app.Model.Category;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ICategoryService {
    public List<Category> ListCategory();
    Optional<Category> findCategoryById(int category_id);
    public Category addCategory(Category add_category);
    public Category updateCategory(Category edit_category);
    public Category deleteCategory(int category_id);
    public List<Category> searchCategory(String keyword);
    Page<Category> getAll(Integer pageNo);
    Page<Category> searchCategory(String keyword, Integer pageNo);
}
