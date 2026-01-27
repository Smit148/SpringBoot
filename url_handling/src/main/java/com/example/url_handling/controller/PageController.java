package com.example.url_handling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class PageController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    // @GetMapping("/product")
    // public String product(Model model) {

    //     model.addAttribute("product_id",200);
    //     return "product";
    // }

    @GetMapping("/product/{id}")
    public String product(@PathVariable int id,Model  model) {

        System.out.println("fetch_id"+id);
        model.addAttribute("product_id",34);
        return "product";
    }
    

}
