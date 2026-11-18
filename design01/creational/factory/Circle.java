package design01.creational.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        IO.println("원 생성");
    }
}
