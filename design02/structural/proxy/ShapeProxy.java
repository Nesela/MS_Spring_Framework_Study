package design02.structural.proxy;

public class ShapeProxy implements Shape{
    private Circle circle;

    @Override
    public void draw() {
        if (circle == null) {
            circle = new Circle();
        }

        circle.draw();
    }
}
