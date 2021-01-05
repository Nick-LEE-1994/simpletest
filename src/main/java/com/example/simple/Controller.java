package com.example.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: likeyu
 * @create: 2020-12-30 10:25
 **/
@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello(){ SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间
        return date+":hello!";
    }
}
