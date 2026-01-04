package com.example.FirstApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerHello {
    
    @GetMapping("/hellonaam")
    public String hello(){
        return "hello";
    }
    @GetMapping("/aboutnaam")
    public String about(){
        return "about";
    }

}