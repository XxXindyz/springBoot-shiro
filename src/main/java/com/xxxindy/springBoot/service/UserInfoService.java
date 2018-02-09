package com.xxxindy.springBoot.service;

import com.xxxindy.springBoot.domain.user.entity.UserInfo;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.UUID;

/**
 * @Author: xxxindy
 * @Date:2018/2/8 上午10:01
 * @Description:
 */
public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);

    void signUp(String username, String simpleHash, String salt) throws Exception;
}
