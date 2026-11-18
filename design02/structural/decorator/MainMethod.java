package design02.structural.decorator;

public class MainMethod {
    void main() {
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
        /*
        decorator pattern : 기존 객체의 코드를 변경하지 않고, 기능을 동적으로 추가
        - component : 공통 구현 인터페이스
        - concreteComponent: 기본 기능을 수행하는 실제 객체
        - Decorator: Component 구현 및 보유
        - ConcreteDecorator : component에 새로운 기능 추가
         */
    }
}
