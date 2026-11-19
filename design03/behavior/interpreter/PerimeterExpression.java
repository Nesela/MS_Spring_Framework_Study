package design03.behavior.interpreter;

public final class PerimeterExpression implements Expression {
    private final Shape shape;

    public PerimeterExpression(Shape shape) {
        this.shape = shape;
    }

    @Override
    public double evaluate() {
        if (shape instanceof Circle c) {
            return 2 * Math.PI * c.r();
        } else if (shape instanceof Square s) {
            return 4 * s.r();
        }
        return 0;
    }
}
