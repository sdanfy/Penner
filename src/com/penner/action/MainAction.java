package com.penner.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainAction {

    @RequestMapping(value="/")
    public String index() throws Exception{
        return "index";
    }
}
