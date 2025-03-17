package com.marciobueno.aos.ex01helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReactController {

    @RequestMapping({ "/", "/{path:[^\\.]*}" })
    public String index() {
        return "redirect:/index.html";
    }
}
