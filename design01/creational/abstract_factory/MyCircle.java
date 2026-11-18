package design01.creational.abstract_factory;

public class MyCircle implements Shape{
    @Override
    public void draw() {
        IO.println("재범 원 생성");
    }
}
