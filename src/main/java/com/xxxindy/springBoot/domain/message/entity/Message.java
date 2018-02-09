package com.xxxindy.springBoot.domain.message.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author: xxxindy
 * @Date:2018/2/6 上午10:31
 * @Description:
 */
//@Entity
public class Message {

    //@Id
    //@GeneratedValue
    private Long id;

    //@Column(nullable = false)
    private String name;

    //@Column(nullable = false)
    private String content;

    public Message(){}

    public Message(String name, String content) {
        this.name = name;
        this.content = content;
    }

    // 省略getter、setter

}