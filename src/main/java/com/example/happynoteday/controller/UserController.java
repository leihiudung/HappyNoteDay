package com.example.happynoteday.controller;

import com.example.happynoteday.vo.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello security";
    }

    @RequestMapping("/hi")
    public Result sayHi() {
        int i =0;
        return Result.ok("hi");
    }
}
