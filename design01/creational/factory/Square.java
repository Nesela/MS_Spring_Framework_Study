package design01.creational.factory;

public class Square implements Shape{
    @Override
    public void draw() {
        IO.println("사각형 생성");
    }
}
