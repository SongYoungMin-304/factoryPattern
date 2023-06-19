package com.example.factorypattern.service;

import com.example.factorypattern.enums.Type;
import org.springframework.stereotype.Component;

@Component
public class TestServiceimpl implements TestService{

    @Override
    public int execute() {
        int sum = 1;

        for(int a = 1; a <= 10; a++){
            sum+=a;
        }

        return sum;
    }

    @Override
    public Type getType() {
        return Type.PLUS;
    }
}
