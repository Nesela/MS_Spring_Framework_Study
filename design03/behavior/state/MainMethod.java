package design03.behavior.state;

public class MainMethod {
    void main() {
        Shape circle = new Circle(2, 3,4);
        circle.draw();

        circle.setState(new SelectedState());
        circle.draw();

        circle.setState(new NormalState());
        circle.draw();
        /*
        state pattern : 객체 내부의 상태에 따라 객체의 행동이 달라지고, 상태별 행동을 별도 클래스로 분리
        - Context : 현재 상태를 보유하고 상태 객체에 행동을 위임
        - State : 상배텰 행동 정의 인터페이스
        - ConcreteState : 각 상태에 따른 실제 행동 구현

        observer : 상태가 변경되면 다른 객체들한테 알림
        state : 상태가 변경되면 행동이 변경
         */
    }
}
