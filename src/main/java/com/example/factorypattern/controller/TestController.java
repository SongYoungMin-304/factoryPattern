package com.example.factorypattern.controller;

import com.example.factorypattern.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    List<TestService> testServices;


    @RequestMapping("/test/{type}")
    public int test(@PathVariable String type){

        int sum = 1;

        if("+".equals(type)){

            for(int a = 1; a <= 10; a++){
                sum+=a;
            }
        }
        else if("*".equals(type)){

            for(int a = 1; a <= 10; a++){
                sum*=a;
            }
        }
        return sum;
    }

    @RequestMapping("/test2/{type}")
    public int test2(@PathVariable String type){

        TestService testService = testServices
                .stream()
                .filter(o -> o.getType().toString().equals(type))
                .findFirst().get();

        int execute = testService.execute();

        return execute;
    }

}
