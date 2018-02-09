package com.xxxindy.springBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: xxxindy
 * @Date:2018/1/29 下午4:34
 * @Description:
 */
@Component
@ConfigurationProperties(prefix = "com.xxxindy")
public class XxXindyProperties {

    @Value("${com.xxxindy.title}")
    private String title;
    @Value("${com.xxxindy.description}")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
