package com.example.spring_boot_app.Controller.Admin;

import com.example.spring_boot_app.Model.SizeProduct;
import com.example.spring_boot_app.Services.SizeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class SizeProductController {
    @Autowired
    private SizeProductService sizeProductService;
    @GetMapping("/size_product")
    public String sizeProduct(Model model,
                              @Param(("keyword")) String keyword,
                              @RequestParam(name = "pageNo", defaultValue = "1") Integer pageNo) {
        //List<SizeProduct> list = sizeProductService.ListSizeProduct();
        Page<SizeProduct> list = sizeProductService.getAll(pageNo);
        if(keyword != null && !keyword.isEmpty()) {
            list = sizeProductService.searchSizeProduct(keyword, pageNo);
            model.addAttribute("keyword", keyword);
        }else{
            list = sizeProductService.getAll(pageNo);
        }
        model.addAttribute("totalPage", list.getTotalPages());
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("ListSizeProduct", list);
        return "admin/size_product/size_product";
    }
}
