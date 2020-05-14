package com.xj.springbootnew.service.impl;

import com.xj.springbootnew.entity.TUser;
import com.xj.springbootnew.mapper.TUserMapper;
import com.xj.springbootnew.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
