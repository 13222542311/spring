package com.xj.springbootnew.controller;

import com.xj.springbootnew.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("page")
public class PageController {

    @GetMapping("hello")
    public String hello(Model model){
        //携带数据
        model.addAttribute("username","java123");
        //携带自定义对象
        User user = new User(1L,"java456",new Date());
        model.addAttribute("user",user);
        //条件判断
        model.addAttribute("money",1000);
        //保存集合用于遍历
        List<User> list = new ArrayList<>();
        list.add(new User(1L,"java12",new Date()));
        list.add(new User(2L,"java13",new Date()));
        model.addAttribute("list",list);

        model.addAttribute("now",new Date());
        return "hello";

    }
}
