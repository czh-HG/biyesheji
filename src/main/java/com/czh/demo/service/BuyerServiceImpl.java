package com.czh.demo.service;

import com.czh.demo.dao.BuyerMapper;
import com.czh.demo.enity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BuyerServiceImpl {
    @Autowired
    private BuyerMapper buyerMapper;

    public List<Buyer> getBuyerByPage(int start,int end){
        return buyerMapper.selectByPage(start,end);
    }

    public int getCount(){
        return buyerMapper.selectCount();
    }
}
