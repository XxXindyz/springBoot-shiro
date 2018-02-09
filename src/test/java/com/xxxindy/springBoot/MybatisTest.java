package com.xxxindy.springBoot;

import com.xxxindy.springBoot.domain.mapper.UserMapper;
import com.xxxindy.springBoot.domain.user.entity.User;
import com.xxxindy.springBoot.domain.user.entity.UserSexEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author: xxxindy
 * @Date:2018/2/7 下午2:34
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery() throws Exception {
        List<User> users = userMapper.getAll();
        System.out.println(users.toString());
        User user = userMapper.getOne(10l);

        System.out.println(user.toString());

    }

    @Test
    public void testInsert() throws Exception {
        userMapper.insert(new User("aadsaddsdsa", "a123456", UserSexEnum.MEN));
        userMapper.insert(new User("bbdsadasddddsa", "b123456", UserSexEnum.WOMEN));
        userMapper.insert(new User("ccdsaddsasdsadsa", "b123456", UserSexEnum.WOMEN));

        Assert.assertEquals(3, userMapper.getAll().size());
    }


    @Test
    public void testUpdate() throws Exception {
        User user = userMapper.getOne(5l);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(userMapper.getOne(5l).getNickName())));
    }
}
