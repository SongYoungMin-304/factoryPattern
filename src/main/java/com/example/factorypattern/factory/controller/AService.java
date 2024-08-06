package com.example.factorypattern.factory.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AService implements serviceInterface{

    @Override
    public String doSomething() {
        log.info("AService doSomething");
        return "AService doSomething";
    }

    @Override
    public String getName() {
        return "AService";
    }
}
