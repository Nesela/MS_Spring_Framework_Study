package design03.behavior.visitor;

public final class AreaVisitor implements Visitor{
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.r(), 2);
        IO.println("원의 넓이 : " + area);
    }

    @Override
    public void visit(Square square) {
        double area = Math.pow(square.r(), 2);
        IO.println("사각형의 넓이 : " + area);
    }
}
