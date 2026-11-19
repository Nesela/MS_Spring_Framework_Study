package design02.structural.facade;

public class MainMethod {
    void main() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawSquare();

        /*
        facade pattern : 복잡한 subsystem (하위 시스템) 대신 하나의 통합된 interface (facade) 를 통해 client가 단순한 사용
        - subsystem : 실제 기능수행 객체
        - facade : subsystem 관리 및 단순하게 사용할 수 있는 interface 제공
         */
    }
}
