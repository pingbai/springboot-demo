package org.laobai.demo.controller;

import org.laobai.demo.entity.User;
import org.laobai.demo.service.UserService;
import org.laobai.demo.struct.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public String demo(){
        return "小哥哥，小姐姐 们，大家上午好！请多多关照";
    }


    @RequestMapping("list")
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping("listByName")
    public List<User> list(String name,Integer ageMin,Integer ageMax){
        return userService.getUsersByNameAndAge(name, ageMin, ageMax);
    }


    @RequestMapping("page")
    public PageResult<User> page(int currPage,int pageSize){
        return userService.getPage(currPage,pageSize);
    }

}
