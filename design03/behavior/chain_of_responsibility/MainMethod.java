package design03.behavior.chain_of_responsibility;

public class MainMethod {
    void main () {
        Handler circleHandler = new CircleHandler();
        Handler squareHandler = new SquareHandler();

        circleHandler.setNext(squareHandler);

        RenderRequest req01 = new RenderRequest(new Circle(2, 2, 1));
        circleHandler.handle(req01);

        RenderRequest req02 = new RenderRequest(new Square(2, 2, 0));
        circleHandler.handle(req02);

        RenderRequest req03 = new RenderRequest(null);
        circleHandler.handle(req03);

        circleHandler.handle(null);
        /*
        chain of responsibility : (책임 연쇄) 요청을 처리할 수 있는 객체가 나타날 때 까지 요청을 다음 객체로 전달
        - Handler : 요청 처리의 공통 인터페이스 및 다음 handler 참조
        - ConcreteHandler : 요청을 처리할 수 있는지 판단하고, 처리할 수 없으면 다음 handler에게 전달
         */
    }
}
