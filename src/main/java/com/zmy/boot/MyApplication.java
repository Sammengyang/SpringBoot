package com.zmy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-25 20:14
 */

/**
 * @SpringBootApplication: 标识这是一个springboot类
 */
@SpringBootApplication(scanBasePackages = "com.zmy")
public class MyApplication {

    public static void main(String[] args) {
        // 返回的是IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        Arrays.asList(names).forEach(name-> System.out.println("name = " + name));
    }
}
