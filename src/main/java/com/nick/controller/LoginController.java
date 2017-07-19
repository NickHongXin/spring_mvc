package com.nick.controller;

import com.nick.entity.User;
import com.nick.entity.UserTbl;
import com.nick.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import org.springframework.beans.factory.FactoryBean;
/**
 * Created by shx on 2017/07/05.
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired(required=true)
    private UserService userService;

    @Autowired
    @Qualifier("conversionService")
    private ConversionService conversionService;

    @RequestMapping("/login/{id}")
    public ModelAndView login(@PathVariable int id, HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView result = new ModelAndView();
        result.getModel().put("user", userService.getUserById(id));
        result.setViewName("login");

        return result;
    }

    @RequestMapping(path = "/confirm", method = RequestMethod.POST)
    public String confirm(@ModelAttribute("user") User user, HttpServletRequest request, HttpServletResponse response) throws Exception{
        user.setIsConfirmed(true);

        return "login";
    }

    @RequestMapping(path="/add", method = RequestMethod.POST)
    @ResponseBody
    public User addUser (@RequestBody User user) throws Exception{
        UserTbl ut = conversionService.convert(user, UserTbl.class);
        User res = new User();
        userService.addUser(user);
        res.setId(user.getId());

        return res;
    }
}
