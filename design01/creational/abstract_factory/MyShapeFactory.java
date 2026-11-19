package design01.creational.abstract_factory;

public class MyShapeFactory implements ShapeFactory{
    @Override
    public Shape createSquare() {
        return new MySquare();
    }

    @Override
    public Shape createCircle() {
        return new MyCircle();
    }
}
