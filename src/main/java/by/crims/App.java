package by.crims;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(RootConfiguration.class);
        Calculator calculator = ac.getBean("calculator", Calculator.class);
        calculator.run();
    }
}