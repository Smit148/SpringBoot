package com.example.PixelCart_Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GearController {

    @GetMapping("/gear/mouse")
    public String gearmouse() 
    {return "gear/mouse";}

    @GetMapping("/gear/keyboard")
    public String gearkeyboard() 
    {return "gear/keyboard";}

    @GetMapping("/gear/conteoller")
    public String gearconteoller() 
    {return "gear/controller";}

}
