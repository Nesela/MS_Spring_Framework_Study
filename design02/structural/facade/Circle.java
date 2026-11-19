package design02.structural.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        IO.println("원 그리기");
    }
}
