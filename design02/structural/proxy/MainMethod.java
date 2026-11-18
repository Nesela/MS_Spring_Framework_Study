package design02.structural.proxy;

public class MainMethod {
    void main() {
        Shape shape = new ShapeProxy();
        shape.draw();
        shape.draw();
        /*
        proxy pattern : 실제 객체에 대한 접근을 proxy가 대신 제어
        - subject : proxy 와 realSubject 의 공통 interface
        - realSubject : 실제 기능 수행 객체
        - proxy : realSubject 객체를 보유 및 접근 제어, 실제 객체에 기능 수행 위임
         */
    }
}
