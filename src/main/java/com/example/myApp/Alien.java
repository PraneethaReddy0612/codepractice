package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    private Computer comp;
    public void build(){
        System.out.println("working on Awesome Project");
        comp.compile();
    }

}
