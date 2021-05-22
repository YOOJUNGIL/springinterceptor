package com.myalley.springinterceptor.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "User Index Welcome!");
        return "/index/index";
    }

}
