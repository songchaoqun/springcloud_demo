package com.jk.util;

import com.jk.model.User;
import com.jk.service.HelloService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserError implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "网络故障 请稍后再试";
    }

    @Override
    public List<User> queryuser() {
        List<User> list=new ArrayList<>();
        User user =new User();
        user.setAge(111);
        user.setName("网络故障,稍后再试");
        list.add(user);
        return list;
    }
}
