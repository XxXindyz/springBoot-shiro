package com.xxxindy.springBoot;

import com.xxxindy.springBoot.domain.user.entity.User;
import com.xxxindy.springBoot.domain.user.dao.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.util.Date;

/**
 * @Author: xxxindy
 * @Date:2018/1/29 下午5:16
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
//@Rollback(value=false)
//@Transactional(transactionManager = "transactionManager")
public class UserRepositoryTests {

   //@Autowired
   //private UserRepository userRepository;

   //@Test
   //public void test() throws Exception {
   //    Date date = new Date();
   //    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
   //    String formattedDate = dateFormat.format(date);

   //    userRepository.updateByUsername("aa1", "aa123456777", "aa@126.com");
   //    userRepository.updateByUsername("bb2", "bb123456777", "bb@126.com");
   //    userRepository.updateByUsername("cc3", "cc123456", "cc@126.com");

   //    Assert.assertEquals(3, userRepository.findAll().size());
   //    Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
   //    userRepository.delete(userRepository.findByUserName("aa1"));
   //}

   //@Test

   //public void testBaseQuery() throws Exception {
   //    for(int i = 0;i< 10;i++) {
   //        User user=new User();
   //        user.setNickName("dddddd"+i);
   //        user.setUserName("hehehehe"+i);
   //        user.setPassWord("ndsjakndksand"+i);
   //        user.setEmail("vdsvdvds"+i);
   //        user.setRegTime("dsadsfjhds"+i);
   //        System.out.println(user);userRepository.save(user);
   //    }



   //    //userRepository.findAll();
   //    //userRepository.findOne(1l);
   //    //
   //    //userRepository.flush();
   //    //userRepository.saveAndFlush(user);
   //    ////userRepository.delete(user);
   //    //userRepository.count();
   //    //userRepository.exists(1l);
   //    //// ...
   //}

   //@Test

   //public void testSimpleQuery() throws Exception {

   //    User user = userRepository.readUserByPassWord("cc123456");
   //    System.out.println(user);
   //}

   //@Test
   //public void testPageQuery() throws Exception {
   //    int page=1,size=10;
   //    Sort sort = new Sort(Sort.Direction.DESC, "id");
   //    Pageable pageable = new PageRequest(page, size, sort);
   //    Page<User> resPage1 = userRepository.findAll(pageable);

   //    System.out.println(resPage1.hasContent());

   //    System.out.println(resPage1.getTotalElements());

   //    System.out.println(resPage1.getTotalPages());

   //    Page<User> resPage2 = userRepository.findByUserName("hehehehe", pageable);
   //    for(User user : resPage2.getContent()){
   //        System.out.println(user.toString());
   //    }
   //}


}
