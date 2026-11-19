package coupling03.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CouplingMain {
    void main() {
        /*
        IoC : Inversion of Control
        Spring Ioc Container를 사용 (BeanFactory -> ApplicationContext)
        - 객체 생성을 사용 클래스가 하지 않는다.
        - spring container가 bean 생성 - > 우리는 가져다 쓰기만
         */

        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageBean korean = (MessageBean) factory.getBean("korean");
        korean.hello("재범");

        MessageBean english = (MessageBean) factory.getBean("english");
        english.hello("jaebeom");

        /*
        강결합 (String Coupling)
        - 결합도가 높다 : MessageBean 클래스가 변경되면, CouplingMain 클래슫고 반드시 수정되어야 함
        - 새로운 기능 추가  시, 키존 코드 수정 필요

        약결합 (Loose Coupling) - interface 사용
        - 결합도가 낮다 : 구현 클래스 변경 시 사용 클래스 수정 불필요
        - 새로운 기능 추가 시, interface 상속

        약겹할 (Loose Coupling) - Spring IoC Container 사용
        - 객체 생성 책임을 스프링 컨테이너에 위임
        - 구현 클래스 변경 시 xml 설정만 수정
        - 사용 클래스는 수정 불필요
         */
    }
}
