package com.xxxindy.springBoot;

import com.xxxindy.springBoot.domain.message.dao.MessageRepository;
import com.xxxindy.springBoot.domain.message.entity.Message;
import com.xxxindy.springBoot.domain.user.dao.UserRepository;
import com.xxxindy.springBoot.domain.user.entity.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: xxxindy
 * @Date:2018/2/6 上午9:54
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultiDataSourceJDBCTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void test() throws Exception {

       //userRepository.save(new User("aaa", "aaa", "aaa", "aaa", "aaa"));
       //userRepository.save(new User("bbb", "bbb", "bbb", "bbb", "bbb"));
       //userRepository.save(new User("ccc", "ccc", "ccc", "ccc", "ccc"));
       //userRepository.save(new User("ddd", "ddd", "ddd", "ddd", "ddd"));
       //userRepository.save(new User("eee", "eee", "eee", "eee", "eee"));



       //messageRepository.save(new Message("o1", "aaaaaaaaaa"));
       //messageRepository.save(new Message("o2", "bbbbbbbbbb"));
       //messageRepository.save(new Message("o3", "cccccccccc"));
       //Assert.assertEquals(5, userRepository.findAll().size());
       //Assert.assertEquals(3, messageRepository.findAll().size());

    }

}
