package com.example.controller;

import com.example.domain.ResultData;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("helloController")
@RequestMapping("/api")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResultData<String> hello() {
        return new ResultData<>(0, "请求成功", "{}");
    }

}