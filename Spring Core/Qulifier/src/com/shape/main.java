package com.shape;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Draw draw = (Draw) context.getBean("draw", Draw.class);
        draw.drawShape();
    }
}
