package di06.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {
    void main() {
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        WeekDay today = factory.getBean("singleton",WeekDay.class);
        IO.println("오늘은 " + today.dayInfo() + " 입니다.");
    }
}
