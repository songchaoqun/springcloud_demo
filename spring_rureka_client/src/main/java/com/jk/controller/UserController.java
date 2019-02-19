package com.jk.controller;

import com.jk.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class UserController {
    //@Autowired
    //private UserService userService;
    @RequestMapping("/queryuser")
    public List<User> queryuser() {
    User user=new User();
    user.setAge(200);
    user.setName("dd");
    User user1=new User();
    user1.setAge(100);
    user1.setName("bb");
    List<User> list=new ArrayList<>();
    list.add(user);
    list.add(user1);

    return list;
    }
}
