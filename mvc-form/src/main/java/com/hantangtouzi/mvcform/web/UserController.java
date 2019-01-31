package com.hantangtouzi.mvcform.web;

import com.hantangtouzi.mvcform.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * @author WilliamChang.
 * Created on 2018/7/10 16:44
 */

@Controller
public class UserController {
    @RequestMapping("/register")
    public String registerForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid User user, Errors errors, RedirectAttributes model) {

        if (errors.hasErrors()) {
            for (ObjectError objectError : errors.getAllErrors()) {
                System.out.println(objectError.getDefaultMessage());
            }
            return registerForm();
        }

        System.out.println("用户保存成功");
        model.addFlashAttribute("user", user);
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list() {
        return "userList";
    }

}
