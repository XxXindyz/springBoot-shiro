package com.xxxindy.springBoot.domain.mapper.test1;

import com.xxxindy.springBoot.domain.user.entity.User;
import com.xxxindy.springBoot.domain.user.entity.UserInfo;
import com.xxxindy.springBoot.domain.user.entity.UserSexEnum;
import org.apache.ibatis.annotations.*;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.List;
import java.util.UUID;

/**
 * @Author: xxxindy
 * @Date:2018/2/8 上午10:02
 * @Description:
 */
public interface UserInfoMapper {

    @Select("SELECT * FROM user_info WHERE username = #{username}")
    @Results({
            @Result(property = "uid",  column = "uid"),
            @Result(property = "username", column = "username"),
            @Result(property = "name", column = "name"),
            @Result(property = "password", column = "password"),
            @Result(property = "salt", column = "salt"),
            @Result(property = "state", column = "state"),
    })
    UserInfo findByUsername(String username);

    @Insert("INSERT INTO user_info(username,password,salt) VALUES (#{username},#{simpleHash},#{salt})")
    void addUserInfo(@Param("username") String username, @Param("simpleHash") String simpleHash,@Param("salt") String salt) throws Exception;
}
