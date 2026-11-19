package design03.behavior.template_method;

public class MainMethod {
    void main() {
        ShapeGenerator generator =new CircleGenerator();

        Shape circle = generator.generate();
        circle.draw();
        /*
        template method pattern : 알고리즘의 전체 실행 순서를 부모클래스에서 정의하고, 세부적인 작업은 자식 클래스에서 구현
        - AbstractClass : 템플릿 메소드와 알고리즘의 기본 구조 정의
        - ConcreteClass : 추상 메서드를 실제 구현하여 구체적인 작업 수행
        - Template method : 알고리즘의 전체 실행 순서 (ShapeGenerator.generate() )
        - Primitive method (operation) : 자식 클래스에서 구현하는 세부 작업 (ShapeGenerator.createShape() )
         */
    }
}
