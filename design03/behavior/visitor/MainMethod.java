package design03.behavior.visitor;

public class MainMethod {
    void main() {
        Shape circle = new Circle(2, 3, 4);
        Shape square = new Square(5, 6, 7);

        AreaVisitor areaVisitor = new AreaVisitor();
        circle.accept(areaVisitor);
        square.accept(areaVisitor);

        PerimeterVisitor perimeterVisitor = new PerimeterVisitor();
        circle.accept(perimeterVisitor);
        square.accept(perimeterVisitor);

        /*
        visitor pattern : 객체의 구조는 변경하지 않으면서,
        객체에 새로운 기능을 추가할 수 있도록,
        기능을 별도의 Visitor 클래스로 분리
        - Element : Visitor를 받아드리는 인터페이스
        - ConcreteElement : 실제 객체
        - Visitor : 객체별 수행 작업을 정의하는 인터페이스
        - ConcreteVisitor : 실제 작업을 구현하는 객체

        strategy : 동일한 작업을 수행하는 알고리즘 교체
        visitor : 객체의 종류에 따라 수행할 작업을 별도의 클래스로 분리

        decorator : 기존 객체에 새로운 기능을 추가
        visitor : 기존 객체의 구조는 유지하면서 새로운 작업을 추가
         */
    }
}
