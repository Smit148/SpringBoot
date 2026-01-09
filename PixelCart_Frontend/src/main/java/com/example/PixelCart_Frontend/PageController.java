package com.example.PixelCart_Frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index()
    {return "index";}
    
    @GetMapping("/pc_games")
    public String pc_games()
    {return "pc_games";}

    @GetMapping("/console_game")
    public String console_game()
    {return "console_game";}

    @GetMapping("/gear")
    public String gear()
    {return "gear";}
    
}
