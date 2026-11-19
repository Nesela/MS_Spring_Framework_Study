package design03.behavior.mediator;

public class MainMethod {
    void main() {
        ShapeManager shapeManager = new ShapeManager();
        Shape circle = new Circle(2,3,4);
        Shape square = new Square(5,6,7);

        shapeManager.addShape(circle);
        shapeManager.addShape(square);

        shapeManager.interact(circle, square);
        /*
        mediator pattern : (중재자 패턴) 여러 객체간의 직접적인 통신을 줄이고, 중재자 객체를 통해 상호작용
        - Mediator : 객체 간 상호작용을 정의하는 인터페이스 (실습에 없음)
        - ConcreteMediator : 실제 중재 로직을 구현하는 객체 (ShapeManager)
        - Colleague : 중재자를 통해 상호작용하는 객체 (Circle, Square)
         */
    }
}
