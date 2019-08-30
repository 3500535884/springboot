package com.testdemo.testdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloHomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting(){

        return  "hello world";

    }

}
