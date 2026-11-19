package design03.behavior.strategy;

public class MainMethod {
    void main() {
        Shape circle = new Circle(2, 3, 4);

        ShapeRenderer renderer = new ShapeRenderer();

        renderer.setStrategy(new SolidDraw());
        renderer.draw(circle);

        renderer.setStrategy(new OutlineDraw());
        renderer.draw(circle);

        /*
        strategy pattern : 동일한 목적을 수행하는 여러 알고리즘을 분리하고
        실행 시점에 원하는 알고리즘을 선택하여 사용
        - Context : 전략 객체를 보유하고 실행하는 객체
        - Strategy : 전략 공통 인터페이스
        - ConcreteStrategy : 실제 알고리즘 구현 객체
         */
    }
}
