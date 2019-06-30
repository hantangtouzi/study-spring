package com.hantangtouzi.mvcannotation.web;

import com.hantangtouzi.mvcannotation.dao.UserDao;
import com.hantangtouzi.mvcannotation.entity.User;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author WilliamChang.
 * @since 2018/7/10 0:32
 */

@Controller
public class HomeController {
    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String findUsers(Model model) {
        List<User> users = userDao.findUsers();
        model.addAttribute("users", users);
        System.out.println("users=" + users);
        return "userList";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String findUserById(@PathVariable Long id, Model model) {
        System.out.println("id=" + id);
        User user = userDao.findUserById(id);
        model.addAttribute("user", user);
        System.out.println("user=" + user);
        return "userDetail";
    }
}
