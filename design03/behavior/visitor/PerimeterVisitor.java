package design03.behavior.visitor;

public final class PerimeterVisitor implements Visitor{
    @Override
    public void visit(Circle circle) {
        double area = 2 * Math.PI * circle.r();
        IO.println("원의 둘레 : " + area);
    }

    @Override
    public void visit(Square square) {
        double area = 4 * square.r();
        IO.println("사각형의 넓이 : " + area);
    }
}
