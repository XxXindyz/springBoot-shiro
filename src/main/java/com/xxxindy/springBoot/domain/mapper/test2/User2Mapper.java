package com.xxxindy.springBoot.domain.mapper.test2;

import com.xxxindy.springBoot.domain.user.entity.User;
import com.xxxindy.springBoot.domain.user.entity.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author: xxxindy
 * @Date:2018/2/7 下午4:54
 * @Description:
 */
public interface User2Mapper {

    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name")
    })
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "userName", column = "user_name")
    })
    User getOne(Long id);

    @Insert("INSERT INTO user(user_name,pass_word,user_sex) VALUES(#{userName}, #{passWord}, #{userSex})")
    void insert(User user);

    @Update("UPDATE user SET user_name=#{userName},nick_name=#{nickName} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);

}
