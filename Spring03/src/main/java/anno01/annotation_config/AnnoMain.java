package anno01.annotation_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoMain {
    void main() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans01.xml");

        Address address = factory.getBean("address", Address.class);
        IO.println(address);
    }
}
