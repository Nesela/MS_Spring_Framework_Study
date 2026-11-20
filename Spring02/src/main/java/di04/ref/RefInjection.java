package di04.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefInjection {
    void main() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Address addr = factory.getBean("address", Address.class);
        IO.println(addr);
    }
}
