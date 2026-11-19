package design02.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setColor(decoratedShape);
    }

    public void setColor(Shape decoratedShape) {
        IO.println("빨강 추가");
    }
}
