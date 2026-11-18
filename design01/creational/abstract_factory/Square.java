package design01.creational.abstract_factory;

public class Square implements Shape{
    @Override
    public void draw() {
        IO.println("사각형 생성");
    }
}
