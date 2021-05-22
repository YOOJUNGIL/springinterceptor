package com.myalley.springinterceptor.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index(Model model) {
        ModelAndView mv = new ModelAndView("/index/index");
        model.addAttribute("name", "YOOJUNGIL");
        return mv;
    }

    @GetMapping("/index2")
    public String index2(Model model) {
        //ModelAndView mv = new ModelAndView("/index/index");
        model.addAttribute("name", "YOOJUNGIL2222");
        return "/index/index";
    }

}
