package design03.behavior.strategy;

public class OutlineDraw implements DrawStrategy{
    @Override
    public void draw(Shape shape) {
        shape.draw();
        IO.println("태두리 도형 그리기");
    }
}
