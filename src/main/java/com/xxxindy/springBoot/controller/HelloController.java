package com.xxxindy.springBoot.controller;

import com.xxxindy.springBoot.XxXindyProperties;
import com.xxxindy.springBoot.domain.user.entity.User;
import com.xxxindy.springBoot.domain.user.dao.UserRepository;
import com.xxxindy.springBoot.domain.user.entity.UserInfo;
import com.xxxindy.springBoot.service.UserInfoService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.UUID;


/**
 * @Author: xxxindy
 * @Date:2018/1/29 下午3:49
 * @Description:
 */
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    XxXindyProperties xxXindyProperties;

    @Autowired
    private UserInfoService userInfoService;
   //@Autowired
   //UserRepository userRepository;
    @RequestMapping("/hello")
    public String index() {
        logger.info("log test ing...");
        System.out.println("heeeeheheehhehe" + xxXindyProperties.getTitle());
        return "Hello Woooorld";
    }

    @RequestMapping("/getOldUser")
    @Cacheable(value="user-key")
    public User getUser() {
        User user= null ;//userRepository.findByUserName("aa");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }

    @RequestMapping("/signUp")
    public String signUp(HttpServletRequest request, Map<String, Object> map) {
        System.out.println("HomeController.signup()");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) return "error signup param";

        try {
            userInfoService.signUp(username,password);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
        return "signUpOk";
    }
}
