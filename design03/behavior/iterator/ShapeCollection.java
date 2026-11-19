package design03.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShapeCollection implements ShapeAggregate, Iterable<Shape> {
    private final List<Shape> shapeList = new ArrayList<>();

    public void addShape (Shape shape) {
        shapeList.add(shape);
    }

    @Override
    public Iterator<Shape> iterator() {
        return shapeList.iterator();
    }
}
