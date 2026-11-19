package design02.structural.proxy;

public class Circle implements Shape {

    public Circle() {
        IO.println("원 객체 생성");
    }

    @Override
    public void draw() {
        IO.println("원 그리기");
    }
}
