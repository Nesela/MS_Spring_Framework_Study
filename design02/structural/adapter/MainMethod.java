package design02.structural.adapter;

public class MainMethod {
    void main() {
        Shape shape = new LineAdapter(new Line());
        shape.draw();
        // adapter pattern : 호환되지 않는 코드들을 연결
    }
}
