package com.xj.springbootnew.service;

import com.xj.springbootnew.entity.MyUser;

import java.util.List;

public interface MyUserService {
    //增加一个Person
    int insertPerson(MyUser myUser);
    //删除一个Person
    int deleteByPersonId(Integer id);
    //更改一个Person
    int updateByPersonId(MyUser record);
    //查询一个Person
    MyUser selectByPersonId(Integer id);
    //查询所有的Person
    List<MyUser> selectAllPerson();
}
