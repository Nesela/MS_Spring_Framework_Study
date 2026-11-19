package design03.behavior.template_method;

public abstract class ShapeGenerator {
    public final Shape generate() {
        prepareResources();
        Shape shape = createShape();
        finalizeResources();

        return shape;
    }

    private void prepareResources() {
        IO.println("실행 전");
    }

    protected abstract Shape createShape();

    private void finalizeResources() {
        IO.println("실행 후");
    }

}
