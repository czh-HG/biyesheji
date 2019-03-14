package com.czh.demo.web;

import com.czh.demo.enity.Buyer;
import com.czh.demo.service.BuyerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/buyer")
public class BuyerController {
    @Autowired
    private BuyerServiceImpl buyerService;

    @RequestMapping(value = "/buyerPage")
    public String toBuyerPage(){
        return "/page/buyer.html";
    }

    @ResponseBody
    @RequestMapping(value = "/getBuyer")
    public Map<String,Object> getBuyer(int page,int limit){
        Map<String,Object> data = new HashMap<String, Object>();
        int start = (page - 1) * limit;
        int end = limit;
        List<Buyer> buyers = buyerService.getBuyerByPage(start,end);
        int count = buyerService.getCount();

        data.put("code",0);
        data.put("msg","");
        data.put("count",count);
        data.put("data",buyers);

        return data;
    }

}
