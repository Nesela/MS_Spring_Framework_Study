package design01.creational.abstract_factory;

public class MainMethod {
    void main() {
        ShapeFactory factory;

        factory = new BasicShapeFactory();
        Shape square = factory.createSquare();
        Shape circle = factory.createCircle();

        square.draw();
        circle.draw();

        factory = new MyShapeFactory();
        Shape mySquare = factory.createSquare();
        Shape myCircle = factory.createCircle();

        mySquare.draw();
        myCircle.draw();

        /*
        factory pattern : 객체 생성 책임 위임
        abstract factory pattern : 관련 객체들을 묶어서 생성 - 합성(composition) 해서 위임 -
         */
    }
}
