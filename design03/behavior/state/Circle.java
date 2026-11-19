package design03.behavior.state;

public class Circle implements Shape {
    private final int x;
    private final int y;
    private final int r;
    private ShapeState state = new NormalState();

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public void draw() {
        state.draw("원", x, y, r);
    }

    @Override
    public void setState(ShapeState state) {
        this.state = state;
    }
}
