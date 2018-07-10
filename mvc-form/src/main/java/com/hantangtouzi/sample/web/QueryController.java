package com.hantangtouzi.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 16:23
 */

@Controller
public class QueryController {
    @RequestMapping
    public String query(@RequestParam("pageSize") Long pageSize, Model model) {
        model.addAttribute("pageSize", pageSize);
        return "query";
    }
}
