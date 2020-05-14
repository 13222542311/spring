package com.xj.springbootnew.controller;

import com.xj.springbootnew.config.Resource;
import com.xj.springbootnew.entity.MyUser;
import com.xj.springbootnew.entity.TUser;
import com.xj.springbootnew.entity.User;
import com.xj.springbootnew.service.IUserService;
import com.xj.springbootnew.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

//@Controller

@RestController
@RequestMapping("user")
public class UserController {

    /*@Value("${image.server}")
    private String imageServer;*/
    @Autowired
    private IUserService userService;

    @Autowired
    private Resource resource;

    @RequestMapping(value="hello",method = RequestMethod.GET)
    //@ResponseBody
    public String hello(){
    return "hello world!!!!hello,springboot.........";
    }

    @GetMapping("getImageServer")
    public String getImageServer(){
        //return  imageServer;
        return  resource.getImageServer();
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public TUser GetById(@PathVariable("id") Integer id){
        System.out.println(id);
        System.out.println("查询id");
        return userService.getById(id);
    }
    @RequestMapping(value = "{id}",method = RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") Long id){
        System.out.println(id);
        System.out.println("删除id");
        return "ok";
    }
    @PostMapping("{id}")
    public String add(User user){

        System.out.println(user.getCntryDate());
        return "ok";
    }



}
