package com.jk.controller;

import com.jk.model.User;
import com.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;


    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return helloService.sayHiFromClientOne( name );
    }

    @GetMapping(value = "/queryuser")
    public List<User> queryuser() {
        return helloService.queryuser();
    }



}
