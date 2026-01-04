package com.example.firstProject2.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {
    
    @GetMapping("/")
    public String Index(Model model){
        model.addAttribute("name","Tony Stark");
        model.addAttribute("h_name","Ironan");

        model.addAttribute("isStudent",false);

        // if

        model.addAttribute("h_name",true);  
        
        // Loop

        List<String> avengers = new ArrayList<>();
        avengers.add("Captain America");
        avengers.add("IronMan");
        avengers.add("Thor");
        avengers.add("Spider-Man");

        model.addAttribute("aven", avengers);

        return "Index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

}
