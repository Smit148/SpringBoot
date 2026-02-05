package com.example.PixelCart_Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConsolePageController {
    
    @GetMapping("/consolegame/battlefield")
    public String consolebattlefield()
    {return "consolegame/battlefield";}   
    
    @GetMapping("/consolegame/bloodborne")
    public String consolebloodborne()
    {return "consolegame/bloodborne";}   
    
    @GetMapping("/consolegame/gta5")
    public String consolegta5()
    {return "consolegame/gta5";}   
    
    @GetMapping("/consolegame/mario")
    public String consolemario()
    {return "consolegame/mario";}   
    
    @GetMapping("/consolegame/rdr2")
    public String consolerdr2()
    {return "consolegame/rdr2";}   
    
    @GetMapping("/consolegame/witcher")
    public String consolewitcher()
    {return "consolegame/witcher";}   

}
