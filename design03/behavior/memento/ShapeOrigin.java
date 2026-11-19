package design03.behavior.memento;

import java.util.Stack;

public class ShapeOrigin {
    private String name;
    private double value;
    private final Stack<ShapeMemento> history = new Stack<>();

    public ShapeOrigin(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public void update(double value) {
        this.value = value;
        IO.println(String.format("상태 변경 : %s -> %f", name, value));
    }

    public void save() {
        history.push(new ShapeMemento(name, value));
        IO.println("상태 저장됨");
    }

    public void undo() {
        if (!history.isEmpty()) {
            ShapeMemento m = history.pop();
            this.value = m.value();
            IO.println("상태 복구됨!");
        }
    }

    public void printStatus() {
        IO.println(String.format("현재 상태 : %s -> %f", name, value));

    }
}
