package com.example.spring_boot_app.Controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class CustomerController {
    @GetMapping("/customer")
    public String customer() {
        return "admin/customer/customer";
    }
}
