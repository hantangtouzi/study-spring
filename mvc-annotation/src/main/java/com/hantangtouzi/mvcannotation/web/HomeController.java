package com.hantangtouzi.mvcannotation.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author WilliamChang.
 * @since 2018/7/10 0:32
 */

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        //System.out.println("------------------------");
        return "home";
    }
}
