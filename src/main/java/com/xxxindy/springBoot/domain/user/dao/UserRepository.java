package com.xxxindy.springBoot.domain.user.dao;

import com.xxxindy.springBoot.domain.user.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: xxxindy
 * @Date:2018/1/29 下午5:13
 * @Description:
 */
public interface UserRepository {//extends JpaRepository<User, Long> {
  //  User findByUserName(String userName);
//
  //  User findByUserNameOrEmail(String username, String email);
//
  //  User readUserByPassWord(String username);
//
  //  Page<User> findAll(Pageable pageable);
//
  // Page<User> findByUserName(String userName,Pageable pageable);
//
  // //User findTopByOrderByAgeDesc();
//
  // //Page<User> queryFirst10ByLastname(String lastname, Pageable pageable);
//
  // //List<User> findFirst10ByLastname(String lastname, Sort sort);
//
  // //List<User> findTop10ByLastname(String lastname, Pageable pageable);
//
  //  @Query("update User u set u.passWord= :password , u.email= :email where u.userName= :username ")
  //  @Modifying
  //  @Transactional
  //  void updateByUsername(@Param("username")String username, @Param("password")String password, @Param("email")String email);
//
  //  @Modifying
  //  @Query("update User u set u.userName = ?1 where u.id = ?2")
  //  int modifyByIdAndUserId(String  userName, Long id);
//
  //  @Transactional
  //  @Modifying
  //  @Query("delete from User where id = ?1")
  //  void deleteByUserId(Long id);
//
  // //@Transactional(timeout = 10)
  // //@Query("select u from User u where u.emailAddress = ?1")
  // //User findByEmailAddress(String emailAddress);
}