package com.hantangtouzi.securityweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 21:46
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World come from thymeleaf!");
        return "index";
    }
}
