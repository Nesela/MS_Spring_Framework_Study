package design03.behavior.mediator;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void interact(Shape shape01, Shape shape02) {
        IO.println("상호작용 : " + shape01 + " & " + shape02);
    }
}
