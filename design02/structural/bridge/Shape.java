package design02.structural.bridge;

public abstract class Shape {
    protected Draw drawImpl;

    public Shape(Draw drawImpl) {
        this.drawImpl = drawImpl;
    }

    // abstraction
    public abstract void draw();
}
