package design03.behavior.command;

public record Square(int x, int y, int r) implements Shape {
    @Override
    public void draw() {
        IO.println(String.format("사각형 그리기 (%d, %d) 곡률 %d", x, y, r));
    }
}
