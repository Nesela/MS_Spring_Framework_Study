package design03.behavior.strategy;

public class SolidDraw implements DrawStrategy{
    @Override
    public void draw(Shape shape) {
        shape.draw();
        IO.println("채워진 도형 그리기");
    }
}
