package com.hantangtouzi.datajdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 12:19
 */

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello() {
        return "hello";
    }
}
