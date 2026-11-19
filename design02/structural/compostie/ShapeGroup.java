package design02.structural.compostie;

import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape{
    private final List<Shape> shapeList = new ArrayList<>();

    public void add(Shape shape) {
        shapeList.add(shape);
    }

    @Override
    public void draw() {
        for (Shape shape : shapeList){
            shape.draw();
        }
    }
}
