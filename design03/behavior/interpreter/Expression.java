package design03.behavior.interpreter;

public sealed interface Expression permits AreaExpression, PerimeterExpression {
    double evaluate();
}
