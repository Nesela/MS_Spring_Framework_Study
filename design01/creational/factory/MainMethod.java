package design01.creational.factory;

public class MainMethod {
    void main() {
        // 다형성
        ShapeFactory factory;

        // 사각형 생성
        factory = new SquareFactory();
        // 객체 생성 책임을 factory에게 위임 (main에서 직접 생ㅅ어하지 않음)
        // -> class 간 결합도를 느슨하게 함!
        Shape square = factory.createShape();
        square.draw();

        // 원 생성
        factory = new CircleFactory();
        Shape circle = factory.createShape();
        circle.draw();
    }
}
