package design02.structural.bridge;

public class Circle extends Shape{

    private int x;
    private int y;
    private int r;

    public Circle(int x, int y, int r, Draw drawImpl) {
        super(drawImpl);
        this.x = x;
        this.y = y;
        this.r = r;
    }


    @Override
    public void draw() {
        IO.println("[원 그리기]");
        drawImpl.draw(x ,y, r);
    }
}
