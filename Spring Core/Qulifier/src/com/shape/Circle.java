package com.shape;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
