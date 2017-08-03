package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by whj on 2017/5/27.
 */
@Controller
@EnableAutoConfiguration
public class Application {

    @RequestMapping("/abc")
    @ResponseBody
    String home(){
        return "nihao 六一";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
