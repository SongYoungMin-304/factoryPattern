package com.example.factorypattern.factory;

import com.example.factorypattern.factory.controller.serviceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FactoryPattern {

    private final List<serviceInterface> serviceList;

    public serviceInterface getService(String serviceName){
        return serviceList.stream()
                .filter(service -> service.getName().equals(serviceName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such service"));
    }

    @RequestMapping("/factory/{serviceName}")
    public String factory(@PathVariable String serviceName){
        return getService(serviceName).doSomething();
    }
}
