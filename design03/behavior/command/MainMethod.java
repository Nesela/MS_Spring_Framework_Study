package design03.behavior.command;

public class MainMethod {
    void main() {
        Shape circle = new Circle(3, 4, 5);
        Shape square = new Square(5, 4, 3);

        DrawCommand draw = new DrawCommand(circle);
        draw.execute();

        MoveCommand move = new MoveCommand(square, 1, 2);
        move.execute();
        /*
        command pattern : 요청(작업)을 별도의 객체로 캡슐화해서 실행 = 요청을 보내는 객체와 실제 작업을 수행하는 객체를 분리

        - command : 명령 객체의 공통 인터페이스 (ShapeCommand)
        - concreteCommand : 실제 명령을 구현하고 작업을 receiver에게 위임 (DrawCommand, MoveCommand)
        - receiver : 실제 작업을 수행하는 객체 (Circle, Square)
        - invoker : 명령 객체의 실행을 요청하는 객체 (실습에서 없음)
         */
    }
}
