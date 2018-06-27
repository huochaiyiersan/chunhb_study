package com.chunhb.springboot.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping(value = "testString")
    public String testString(){
        return "test";
    }
}
