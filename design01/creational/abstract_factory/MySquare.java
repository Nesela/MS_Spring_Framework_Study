package design01.creational.abstract_factory;

public class MySquare implements Shape{
    @Override
    public void draw() {
        IO.println("재범 사각형 생성");
    }
}
