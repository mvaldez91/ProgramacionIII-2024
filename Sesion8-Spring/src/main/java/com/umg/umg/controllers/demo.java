package com.umg.umg.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo")
public class demo {
    @GetMapping("/hello")
    public String Hello(@RequestParam String name){
        return String.format("Hello %s!", name);
    }

}
