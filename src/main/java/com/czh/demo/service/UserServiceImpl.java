package com.czh.demo.service;

import com.czh.demo.common.PageBean;
import com.czh.demo.dao.RoleMapper;
import com.czh.demo.dao.UserMapper;
import com.czh.demo.enity.Role;
import com.czh.demo.enity.User;
import com.czh.demo.enity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    public User getUser(String username){
        User user = userMapper.selectByUsername(username);
//        User user = userMapper.selectByPrimaryKey(1);
        return user;
    }

    public Role getRole(String username){
        Role role = roleMapper.selectByPrimaryKey(getUser(username).getRoleId());
        return role;
    }

    public List<UserRole> getUserByPage(int start, int end){
        return userMapper.selectByPage(start,end);
    }

    public int getCount(){
        return userMapper.selectCount();
    }

}
