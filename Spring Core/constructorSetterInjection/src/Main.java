import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext contener = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Shape circle = context.getBean("circle", Shape.class);
        double radius = 100;
        double height = 20;
        double width = 15;
        circle c = contener.getBean("cicleConstructorInjection", circle.class);
        c.draw2dCircle();
        c.draw3dCircle();
        square s = contener.getBean("squareSetterInjection", square.class);
        s.drawSquare2d();
        s.drawSquare3d();
    }
}