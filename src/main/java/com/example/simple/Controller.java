package com.example.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: likeyu
 * @create: 2020-12-30 10:25
 **/
@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello(){
        return "HELLO!";
    }
}
