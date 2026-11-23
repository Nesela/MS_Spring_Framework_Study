package anno02.component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoMain {
    void main() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans02.xml");

        Person person = factory.getBean("person", Person.class);
        Address address = factory.getBean("address", Address.class);

        IO.println(person);
        IO.println(address);
    }
}
