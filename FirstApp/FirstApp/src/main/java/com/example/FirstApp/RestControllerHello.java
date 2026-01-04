


package com.example.FirstApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class RestControllerHello {
    
    @GetMapping("/resthello")
    public String restHello(){
        return "Hello world using restController";
    }
    
    @GetMapping("/resthello1")
    public String restHello1(){
        return "Hello world using restController 111";
    }
}

