package com.czh.demo.web;

import com.alibaba.druid.support.json.JSONUtils;
import com.czh.demo.common.ResultMap;
import com.czh.demo.enity.UserRole;
import com.czh.demo.service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController{
//    private static final Logger log = LoggerFactory.getLogger(VehicelController.class);

    @Autowired
    private UserServiceImpl userService;

    @ResponseBody
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public ResultMap getMessage() {
        return ResultMap.success("您拥有用户权限，可以获得该接口的信息！");
    }

    @RequestMapping(value = "/userIndex")
    public String toUserIndex(){
        return "/page/main.html";
    }

    @RequestMapping(value = "/userPage")
    public String toUserPage(){
        return "/page/user.html";
    }

    @RequestMapping(value = "/bigData")
    public String toBigData(){
        return "/page/bigdata.html";
    }

    @RequestMapping(value = "/warehouseMap")
    public String toWarehouseMap(){
        return "/page/warehousemap.html";
    }

    @ResponseBody
    @RequestMapping(value = "/getUser")
    public Map<String,Object> getUser(int page,int limit){
        Map<String,Object> data = new HashMap<String, Object>();
        int start = (page - 1) * limit;
        int end = limit;
        List<UserRole> userRoles = userService.getUserByPage(start,end);
//        String user = JSONUtils.toJSONString(userRoles);
        int count = userService.getCount();

        data.put("code",0);
        data.put("msg","");
        data.put("count",count);
        data.put("data",userRoles);
//        data.put("data",user);

        return data;
    }
}
