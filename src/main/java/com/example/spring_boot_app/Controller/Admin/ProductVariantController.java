package com.example.spring_boot_app.Controller.Admin;

import com.example.spring_boot_app.Model.ProductVariant;
import com.example.spring_boot_app.Services.ProductVariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class ProductVariantController {
    @Autowired
    private ProductVariantService productVariantService;
    @GetMapping("/product_variant")
    public String productVariant(Model model) {
        List<ProductVariant> list = productVariantService.ListProductVariant();
        model.addAttribute("ListProductVariant", list);
        return "admin/product_variant/product_variant";
    }
}
