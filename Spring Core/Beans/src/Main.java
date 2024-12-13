import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        circle c = (circle) context.getBean("circleBean", circle.class);
        System.out.println(c.getArea());
        square s = (square) context.getBean("squareBean", square.class);
        System.out.println(s.getArea());
        }
    }
