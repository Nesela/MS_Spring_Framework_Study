package design02.structural.flyweight;

public class MainMethod {
    void main() {
        String[] colorList = {"Red", "Green", "Blue", "White", "Black"};

        for (int i = 0; i < 10; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colorList[(int) (Math.random() * colorList.length)]);
            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 100));
            circle.setRadius((int) (Math.random() * 100));
            circle.draw();
        }
        /*
        flyweight pattern : 객체를 매번 새로 생성하지 않고, 이미 생성한 객체를 재사용
        -> 내부(공유) 상태 intrinsic (color) | 외부 상태 extrinsic (x, y, r)
        - flyweight : 공유 객체의 공통 인터페이스
        - concreteFlyweight : 실제 공유 객체
        - flyweightFactory : 객체 생성하고, 캐싱하고, 재사용

        * 비교!!
        factory = 1:N (객체 생성하는 방법 분리)
        flyweight = N:M (객체 공유해서 메모리 절약)
        */
    }
}
