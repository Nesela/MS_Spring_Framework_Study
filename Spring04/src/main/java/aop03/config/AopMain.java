package aop03.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    void main() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("aop03.xml");
        Worker dev = factory.getBean("dev", Worker.class);
        Worker engi = factory.getBean("engi", Worker.class);

        engi.daily();
        IO.println("-----");
        dev.daily();
    }
}
