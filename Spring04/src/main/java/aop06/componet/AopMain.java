package aop06.componet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    void main() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("aop06.xml");
        Worker developer = factory.getBean("developer", Worker.class);
        Worker engineer = factory.getBean("engineer", Worker.class);

        developer.daily();
        IO.println("-----");
        engineer.daily();
    }
}
