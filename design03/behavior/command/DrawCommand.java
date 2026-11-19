package design03.behavior.command;

public record DrawCommand(Shape shape) implements ShapeCommand{
    @Override
    public void execute() {
        shape.draw();
    }
}
