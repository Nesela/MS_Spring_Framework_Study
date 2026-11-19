package design02.structural.bridge;

public class MainMethod {
    void main() {
        Shape c01 = new Circle(10, 20, 5, new WindowsDraw());
//        Shape c02 = new Circle(30, 40, 10, new MacDraw());
        c01.draw();
//        c02.draw();;

        /*
        bridge pattern : 추상부와 구현부를 분리하여 독립적으로 확장
        - abstraction : (Shape) implementor의 구현부를 가진다 -> 기능 구현을 위임
        - implementor : (Draw) 기능 구현을 위한 interface
        - refind abstraction: (Circle) abstraction을 상속받아 긴으 확장
        - concrete implementor : (WindowsDraw, MacDraw) implementor를 실제 구현
         */
    }
}
