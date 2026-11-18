package design01.creational.factory;

public class SquareFactory extends ShapeFactory{

    @Override
    public Shape createShape() {
        // 객체 생성 위임
        return new Square();
    }
}
