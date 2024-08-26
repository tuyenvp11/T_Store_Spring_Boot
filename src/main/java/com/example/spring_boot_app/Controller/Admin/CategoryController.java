package com.example.spring_boot_app.Controller.Admin;

import com.example.spring_boot_app.Model.Category;
import com.example.spring_boot_app.Services.CategoryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class CategoryController {
    @Autowired
    public CategoryService categoryService;
    @GetMapping("/category")
    public String category(Model model,
                           @Param(value="keyword") String keyword ,
                           @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
        Page<Category>list = categoryService.getAll(pageNo);

        if(keyword != null && !keyword.isEmpty()) {
            list = categoryService.searchCategory(keyword, pageNo);
            model.addAttribute("keyword", keyword);
        }else{
            list = categoryService.getAll(pageNo);
        }

        model.addAttribute("totalPage", list.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("ListCategory",list);
        return "admin/category/category";
    }

    // thêm danh mục
    @GetMapping(value = "/category/add_category")
    public String add_category(Model model){
        Category add_category = new Category();
        model.addAttribute("add_category", add_category);
        return "admin/category/add_category";
    }
    @PostMapping("/category/add_category")
    public String save_category(Model model,@Valid @ModelAttribute("category") Category save_category , BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "admin/category/add_category";
        }
        categoryService.addCategory(save_category);
        return "redirect:/admin/category";
    }

    // sửa danh mục
    @GetMapping("/category/edit_category/{category_id}")
    public String edit_category(Model model, @PathVariable("category_id")Integer category_id){
        Optional<Category>category = categoryService.findCategoryById(category_id);
        model.addAttribute("edit_category", category.get());
        return "admin/category/edit_category";
    }
    @PostMapping("/category/edit_category")
    public String update_category(@Valid @ModelAttribute("edit_category") Category category, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "admin/category/edit_category";
        }
        categoryService.updateCategory(category);
        return "redirect:/admin/category";
    }

    @GetMapping("/category/del_category/{category_id}")
    public String del_category(Model model, @PathVariable("category_id")Integer idCategory){
        categoryService.deleteCategory(idCategory);
        return "redirect:/admin/category";
    }
}
