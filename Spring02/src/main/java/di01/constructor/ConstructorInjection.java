package di01.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjection {
    void main() {
//        Address hons = new Address("hong-gd", "soule", "010-1111-1111");

        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        Address hong01 = (Address) factory.getBean("hong01");
        IO.println(hong01);

//        Address hong02 = (Address) factory.getBean("hong02");
        Address hong02 = factory.getBean("hong02", Address.class);
        IO.println(hong02);

        Address lee = factory.getBean("lee", Address.class);
        IO.println(lee);

        /*
        DI (Dependency Injection) : 의존성 주입
        - 필요로 하는 의존 대상을
        -객체 생성과 의존 객체
        -객체 간 결합도를 낮추고
         */

    }
}
