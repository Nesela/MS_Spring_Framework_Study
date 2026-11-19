package design02.structural.bridge;

public class RedCircle extends Circle{

    public RedCircle(int x, int y, int r, Draw drawImpl) {
        super(x, y, r, drawImpl);
    }

    @Override
    public void draw() {
        IO.println("[빨간 원 그리기]");
        super.draw();
    }
}
