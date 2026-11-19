package design03.behavior.state;

public interface Shape {
    void draw();
    void setState(ShapeState state);
}
