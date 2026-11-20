package di05.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredInjection {
    void main() {

        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Address auto = factory.getBean("auto", Address.class);

        IO.println(auto);
    }
}
