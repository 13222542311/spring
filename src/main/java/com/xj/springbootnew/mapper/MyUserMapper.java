package com.xj.springbootnew.mapper;


import com.xj.springbootnew.entity.MyUser;
import com.xj.springbootnew.service.MyUserService;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface  MyUserMapper  {
    //增加一个Person
    @Insert("insert into t_user(id,name,password)values(#{id},#{name},#{password})")
    int insert(MyUser person);
    //删除一个Person
    @Delete("delete from t_user where id = #{id}")
    int deleteByPrimaryKey(Integer id);
    //更改一个Person
    @Update("update t_user set name =#{name},password=#{password} where id=#{id}")
    int updateByPrimaryKey(MyUser id);
    //查询一个Person    @Select("select id,name ,password from t_user where id = #{id}")
    MyUser selectByPrimaryKey(Integer id);
    //查询所有的Person
    @Select("select id,name,password from t_user")
    List<MyUser> selectAllPerson();
}
