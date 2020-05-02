package com.funtl.hello.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Method;


@RestController
@SpringBootApplication
public class HelloSpringBootApplication {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String sayHi(){
        return "Say SpringBoot";
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloSpringBootApplication.class, args);
    }

}
