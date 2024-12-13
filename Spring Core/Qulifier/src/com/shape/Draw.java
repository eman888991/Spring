package com.shape;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Draw {
     @Autowired
     @Qualifier("circle")
     private Shape shape;

    public void drawShape() {
        shape.draw();
    }
}
