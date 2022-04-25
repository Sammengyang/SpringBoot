package com.zmy.boot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sam  Email:superdouble@yeah.net
 * @Description
 * @create 2022-04-25 20:16
 */
//@Controller
//@ResponseBody  ResponseBody 表示该类返回的都是json数据类型
@RestController // 代替Controller 和ResponseBody 表示控制器，并且方法返回json数据类型
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello Spting Boot  你好";
    }
}
