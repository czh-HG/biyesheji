package com.czh.demo.dao;

import com.czh.demo.common.MyBatisDao;
import com.czh.demo.enity.User;
import com.czh.demo.enity.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@MyBatisDao
@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUsername(String username);

    List<UserRole> selectByPage(@Param(value = "start") int start,@Param(value = "end") int end);

    int selectCount();
}