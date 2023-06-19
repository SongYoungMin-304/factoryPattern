package com.example.factorypattern.service;

import com.example.factorypattern.enums.Type;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    public int execute();

    public Type getType();

}
