package design03.behavior.state;

public class NormalState implements ShapeState{

    @Override
    public void draw(String name, int x, int y, int r) {
        IO.println(String.format("%s 그리기 : (%d, %d) 크기 %d", name, x, y, r));
    }
}
