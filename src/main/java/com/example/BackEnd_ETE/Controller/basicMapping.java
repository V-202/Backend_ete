package com.example.BackEnd_ETE.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class basicMapping {

    @RequestMapping("/")
    public String index(){
        return "index";
    }


    @RequestMapping("/userinfo")
    public String userinfo()
    {
        return "html/Userinfo";
    }

}
