package com.example.spring_boot_app.Controller.Home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "home/index";
    }

    @GetMapping("/cart")
    public String cart() {
        return "home/cart";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return "home/checkout";
    }

    @GetMapping("/product_detail")
    public String product_detail() {
        return "home/product_detail";
    }
}
