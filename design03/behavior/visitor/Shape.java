package design03.behavior.visitor;

public interface Shape {
    void draw();
    void accept(Visitor visitor);
}
