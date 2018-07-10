package com.hantangtouzi.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 16:28
 */

@Controller
public class PathController {
    @RequestMapping("/path/{id}")
    public String path(@PathVariable("id") Long id, Model model) {
        model.addAttribute("id", id);
        return "path";
    }
}
