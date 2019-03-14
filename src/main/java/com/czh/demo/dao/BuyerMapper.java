package com.czh.demo.dao;

import com.czh.demo.enity.Buyer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    Buyer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);

    List<Buyer>  selectByPage(@Param(value = "start") int start, @Param(value = "end") int end);

    int selectCount();
}