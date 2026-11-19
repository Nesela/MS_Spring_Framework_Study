package design01.creational.abstract_factory;

public class BasicShapeFactory implements ShapeFactory{
    @Override
    public Shape createSquare() {
        return new Square();
    }

    @Override
    public Shape createCircle() {
        return new Circle();
    }
}
