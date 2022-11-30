package com.lvohaaviator.Aviator.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @GetMapping("/")
    //@RequestParam(name="name", required=false, defaultValue="World")
    public String greeting(Model model) {
        model.addAttribute("name", "Сука");
        return "greeting";
    }

}