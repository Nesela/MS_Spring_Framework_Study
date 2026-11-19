package design03.behavior.command;

public sealed interface ShapeCommand permits DrawCommand, MoveCommand{
    void execute();
}
