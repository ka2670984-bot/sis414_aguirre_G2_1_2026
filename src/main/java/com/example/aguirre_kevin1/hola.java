package com.example.aguirre_kevin1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

public class hola {
    @GetMapping
    public String holamundo(){
        return "hola mundo";
    }
}
