package com.unicorn.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <p>
 * </p>
 * Created on 2021/04/12 19:58
 *
 * @author Unicorn
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class PersonConfig {
    private String name;
    private int age;
    private Date birthday;
    private String[] hobbies;
}
