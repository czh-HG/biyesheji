package com.czh.demo.web;

import com.czh.demo.common.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class GuestController{

//    private final ResultMap resultMap;
//
//    public GuestController(ResultMap resultMap) {
//        this.resultMap = resultMap;
//    }

    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public ResultMap<String> login() {
        return ResultMap.success("欢迎进入，您的身份是游客");
    }

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap submitLogin() {
//        return resultMap.success().message("您拥有获得该接口的信息的权限！");
        return ResultMap.success("您拥有获得该接口的信息的权限！");
    }
}

