package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author eddie
 * @createTime 2019-01-10
 * @description 测试控制器
 */
@Controller
public class TestController {

    @GetMapping("test")
    public void test(){
        System.out.println("eee");
    }
}
