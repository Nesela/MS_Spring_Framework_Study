package design03.behavior.observer;

public class MainMethod {
    void main() {
        Shape circle = new Circle(2,4,4);
        ShapeSubject subject = new ShapeSubject(circle);
        subject.addObserver(new ShapeObserver("옵저버"));
        subject.notifyObserver("원 상태 변경됨");
        /*
        observer pattern : 하나의 객체 (Subject) 의 상태가 변경되면,
        해당 객체를 관찰하는 여러 객체 (Observer) 에게 변경 사항을 자동으로 알림
        - Subject : Observer 등록 및 알림 전달
        - ConcreteSubject : 실제 관찰 대상 객체 (ShapeSubject)
        - Observer : 관찰자 공통 인터페이스
        - ConcreteObserver : 알림을 전달받아 처리하는 객체 (ShapeObserver)

        mediator : 여러 객체 사이의 상호작용
        observer : 한 객체의 상태변경을 여러 관찰자에게 전달
         */
    }
}
