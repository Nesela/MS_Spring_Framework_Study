package design03.behavior.memento;

public class MainMethod {
    void main() {
        ShapeOrigin origin = new ShapeOrigin("도형", 5.0);
        origin.printStatus();
        origin.save();

        origin.update(10.0);
        origin.printStatus();

        origin.undo();
        origin.printStatus();
        /*
        memento pattern : 객체의 내부 상태를 별도 객체에 저장하고, 필요할 때 저장된 상태로 복원
        - Originator : 자신의 상태를 저장하고 복원
        - Memento : Originator의 상태를 저장하는 객체
        - CareTaker : Memento 객체를 보관하고 관리하는 객체 (실습에없음)
         */
    }
}
