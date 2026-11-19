package design03.behavior.interpreter;

public record AreaExpression(Shape shape) implements Expression {
    @Override
    public double evaluate() {
        if (shape instanceof Circle c) {
            return Math.PI * Math.pow(c.r(), 2);
        } else if (shape instanceof Square s) {
            return Math.pow(s.r(), 2);
        }
        return  0;
    }
}
