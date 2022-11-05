package io.hxjstudy.javamybatis2springtiny.controller;

import io.hxjstudy.javamybatis2springtiny.mapper.UserMapper;
import io.hxjstudy.javamybatis2springtiny.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "get_one", method = RequestMethod.GET)
    @ResponseBody
    public UserInfo getOne(){
        UserInfo one = userMapper.findOne();
        System.out.println(one);
        return one;
    }
}
