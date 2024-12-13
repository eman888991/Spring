package com.shape;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
