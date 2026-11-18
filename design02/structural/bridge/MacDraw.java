package design02.structural.bridge;

public class MacDraw implements Draw{
    @Override
    public void draw(int x, int y, int r) {
        IO.println(String.format("window에서 그리기 : %d %d %d", x, y, r));
    }
}
