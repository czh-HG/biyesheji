package com.czh.demo.dao;

import com.czh.demo.enity.Good;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Good record);

    int insertSelective(Good record);

    Good selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);

    List<Good> selectByPage(@Param(value = "start") int start, @Param(value = "end") int end);

    int selectCount();
}