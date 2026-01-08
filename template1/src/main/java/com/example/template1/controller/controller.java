package com.example.template1.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controller {
    
    @GetMapping("/")
    public String index()
    {return "index";}
    
    @GetMapping("/about")
    public String about()
    {return "about";}
    
    @GetMapping("/contact")
    public String contact()
    {return "contact";}

}
