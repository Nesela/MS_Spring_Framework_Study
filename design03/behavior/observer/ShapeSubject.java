package design03.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class ShapeSubject {
    private final List<ShapeObserver> observerList = new ArrayList<>();
    private final Shape shape;

    public ShapeSubject(Shape shape) {
        this.shape = shape;
    }
    public void addObserver(ShapeObserver observer) {
        observerList.add(observer);
    }

    public void notifyObserver(String message) {
        for (ShapeObserver observer : observerList) {
            observer.update(message);
        }
    }
}
