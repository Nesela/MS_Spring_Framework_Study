package di03.tag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TagInjection {
    void main() {

        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person you = factory.getBean("you", Person.class);
        Person kang = factory.getBean("kang", Person.class);

        IO.println(you);
        IO.println(kang);
    }
}
