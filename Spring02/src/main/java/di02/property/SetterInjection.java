package di02.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {
    void main() {

        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Address hong = factory.getBean("hong", Address.class);
        IO.println(hong);

        Address lee =factory.getBean("lee-ss", Address.class);
        IO.println(lee);
    }
}
