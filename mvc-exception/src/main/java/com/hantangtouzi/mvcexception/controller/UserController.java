package com.hantangtouzi.mvcexception.controller;

import com.hantangtouzi.mvcexception.entity.User;
import com.hantangtouzi.mvcexception.exception.UserNotFoundException;
import com.hantangtouzi.mvcexception.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WilliamChang.
 * Created on 2018/7/12 9:24
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/list/{id}")
    public String list(@PathVariable("id") Long id, Model model) {
        System.out.println("id = " + id);
        User user = userService.getUserById(1L);
        System.out.println("user = " + user);
        if (id == 3) {
            throw new UserNotFoundException();
        }
        model.addAttribute("user", user);
        return "userList";
    }

    //@ExceptionHandler(UserNotFoundException.class)
    //public String handleUserNotFoundException() {
    //    return "error/500";
    //}
}
