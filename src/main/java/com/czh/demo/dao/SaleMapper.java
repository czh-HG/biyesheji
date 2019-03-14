package com.czh.demo.dao;

import com.czh.demo.enity.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sale record);

    int insertSelective(Sale record);

    Sale selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);

    List<Sale> selectByPage(@Param(value = "start") int start, @Param(value = "end") int end);

    int selectCount();
}