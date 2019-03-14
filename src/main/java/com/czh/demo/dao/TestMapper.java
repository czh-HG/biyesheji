package com.czh.demo.dao;

import com.czh.demo.common.MyBatisDao;
import com.czh.demo.enity.Test;
import org.apache.ibatis.annotations.Mapper;

//@MyBatisDao
@Mapper
public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}