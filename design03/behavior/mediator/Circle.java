package design03.behavior.mediator;

public record Circle(int x, int y, int r) implements Shape {
    @Override
    public void draw() {
        IO.println(String.format("원 그리기 (%d, %d) 반지름 %d", x, y, r));
    }
}
