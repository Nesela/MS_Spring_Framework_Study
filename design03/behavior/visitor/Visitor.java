package design03.behavior.visitor;

public sealed interface Visitor permits AreaVisitor, PerimeterVisitor{
    void visit(Circle circle);
    void visit(Square square);
}
