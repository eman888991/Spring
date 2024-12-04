package ShapPackage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainTest {
    public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Constructor injection in circle class using component
        CircleShap circleShap = context.getBean("circleShap", CircleShap.class);
        circleShap.draw2dShap();
        circleShap.draw3dShap();
        // setter injection in squareShap using component
        SquareShap squareShap = context.getBean("squareShap" , SquareShap.class);
        squareShap.draw2dShap();
        squareShap.draw3dShap();



    }
}
