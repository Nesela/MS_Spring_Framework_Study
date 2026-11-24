package aop04.autoproxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
    void main() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("aop04.xml");

        Worker dev = factory.getBean("dev", Worker.class);
        Worker engi = factory.getBean("engi", Worker.class);

        dev.daily();
        IO.println("-----");
        engi.daily();
    }
}
