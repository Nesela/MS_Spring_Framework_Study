package design02.structural.compostie;

public class MainMethod {
    void main(){
        Circle circle = new Circle();
        Square square = new Square();

        ShapeGroup group = new ShapeGroup();
        group.add(circle);
        group.add(square);

        group.draw();
        /*
        composite pattern : 단일 객체와 객체 묶음을 같은 형태로 사용
        - component : 단일 객체와 묶음 객체의 공통 인터페이스
        - leaf : 기능 수행 객체
        - composite : 여러 component (leaf, component 포함) 들을 저장 및 관리, 내부의 단일 객체들에게 기능 수행 위임
         */
    }
}
