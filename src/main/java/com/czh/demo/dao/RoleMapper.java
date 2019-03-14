package com.czh.demo.dao;

import com.czh.demo.common.MyBatisDao;
import com.czh.demo.enity.Role;
import org.apache.ibatis.annotations.Mapper;

//@MyBatisDao
@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}