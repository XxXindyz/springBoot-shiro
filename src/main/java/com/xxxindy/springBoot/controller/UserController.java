package com.xxxindy.springBoot.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xxxindy.springBoot.domain.mapper.test1.User1Mapper;
import com.xxxindy.springBoot.domain.mapper.test2.User2Mapper;
import com.xxxindy.springBoot.domain.user.entity.User;
import com.xxxindy.springBoot.domain.user.entity.UserSexEnum;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @Author: xxxindy
 * @Date:2018/2/7 下午5:01
 * @Description:
 */
@RestController
public class UserController {

    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users=user2Mapper.getAll();
        return users;
    }

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable(name = "id") Long id) {

        User user=user1Mapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(User user) {
        user2Mapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(User user) {
        user2Mapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        user1Mapper.delete(id);
    }


}
