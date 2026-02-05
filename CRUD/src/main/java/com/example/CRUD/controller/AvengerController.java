package com.example.CRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// import com.example.CRUD.model.Avenger;
import com.example.CRUD.repository.AvengerRepository;


@Controller
public class AvengerController {

    private AvengerRepository repo;
    
    public AvengerController(AvengerRepository repo){
        this.repo = repo;
    }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("avengers", repo.findAll());
        System.out.println(repo.findAll());
        // model.addAttribute("avenger", new Avenger());         //Creates an empty Avenger object. i.e avenger (By default name of the object is same as class name)
        return "index";
    }

}

// (@ModelAttribute Avenger avenger):
//     Spring automatically
//     1. Reads request parameters (name, heroic_name)
//     2. Creates a new Avenger object
//     3. Sets fields: avenger.setName(...), avenger.setHeroic_name(...)