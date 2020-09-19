package com.gfc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guofucheng
 * @version 1.0
 * @date 2020/9/19 1:25 上午
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public Object hello(){
        return "hello,world!";
    }
}
