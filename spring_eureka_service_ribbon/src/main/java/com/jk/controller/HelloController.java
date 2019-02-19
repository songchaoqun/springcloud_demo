package com.jk.controller;

import com.jk.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    //restful编程风格
    // @GetMapping(value = "/hi")  查询方法@RequestMapping(value = "/hi",method = RequestMethod.GET)
    // @DeleteMapping  //删除方法  @RequestMapping(value = "/hi",method = RequestMethod.DELETE)
    // @PutMapping   //修改方法   @RequestMapping(value = "/hi",method = RequestMethod.PUT)
    // @PostMapping  //新增方法  @RequestMapping(value = "/hi",method = RequestMethod.POST)
    @RequestMapping(value = "/hi",method= RequestMethod.GET)
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
