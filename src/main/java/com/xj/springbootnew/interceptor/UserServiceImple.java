package com.xj.springbootnew.interceptor;

import com.xj.springbootnew.entity.MyUser;
import com.xj.springbootnew.mapper.MyUserMapper;
import com.xj.springbootnew.service.MyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImple extends UserAdapter  implements MyUserService{
    @Override
    public void add() {

    }
    @Autowired
    private MyUserMapper myuserMapper;
    @Override
    public int insertPerson(MyUser myUser) {
        return myuserMapper.insert(myUser);
    }

    @Override
    public int deleteByPersonId(Integer id) {
        return myuserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateByPersonId(MyUser record) {
        return myuserMapper.updateByPrimaryKey(record);
    }

    @Override
    public MyUser selectByPersonId(Integer id) {
        return myuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<MyUser> selectAllPerson() {
        return myuserMapper.selectAllPerson();
    }
}
