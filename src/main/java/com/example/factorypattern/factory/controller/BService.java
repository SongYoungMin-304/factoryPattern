package com.example.factorypattern.factory.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BService implements serviceInterface{
    @Override
    public String doSomething() {
        log.info("BService doSomething");
        return "BService doSomething";
    }

    @Override
    public String getName() {
        return "BService";
    }
}
