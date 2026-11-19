package design01.creational.factory;

public class CircleFactory extends ShapeFactory{
    @Override
    public Shape createShape(){
        return new Circle();
    }
}
