package design03.behavior.command;

public record MoveCommand(Shape shape, int x, int y) implements ShapeCommand{
    @Override
    public void execute() {
        IO.println(String.format("도형을 (%d, %d) 로 이동", x, y));
    }
}
