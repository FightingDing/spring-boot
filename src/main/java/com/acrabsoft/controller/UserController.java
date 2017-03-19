package com.acrabsoft.controller;

import com.acrabsoft.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dingzd on 2016-12-27.
 */
//@EnableAutoConfiguration
@RestController
public class UserController {

    @RequestMapping("/")
    String view(){
        return "Hello World!";
    }

   /* public static void main(String[] args) {
        SpringApplication.run(UserController.class);
    }*/

}
