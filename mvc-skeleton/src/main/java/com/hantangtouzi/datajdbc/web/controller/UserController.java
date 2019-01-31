package com.hantangtouzi.datajdbc.web.controller;

import com.hantangtouzi.datajdbc.entity.User;
import com.hantangtouzi.datajdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 3:43
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/get/{id}")
    public String getUserById(@PathVariable("id") Long id, Model model) {
        User user = userService.getUserById(id);
        System.out.println(user);
        model.addAttribute("user", user);
        return "userInfo";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<User> list() {
        return userService.findUsers();
    }
}
