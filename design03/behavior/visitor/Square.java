package design03.behavior.visitor;

public record Square(int x, int y, int r) implements Shape {
    @Override
    public void draw() {
            IO.println(String.format("사각형 그리기 (%d, %d) 반지름 %d", x, y, r));
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
