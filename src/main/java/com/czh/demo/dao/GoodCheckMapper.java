package com.czh.demo.dao;

import com.czh.demo.enity.GoodCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodCheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodCheck record);

    int insertSelective(GoodCheck record);

    GoodCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodCheck record);

    int updateByPrimaryKey(GoodCheck record);

    List<GoodCheck> selectByPage(@Param(value = "start") int start, @Param(value = "end") int end);

    int selectCount();
}