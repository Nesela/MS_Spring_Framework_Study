package design03.behavior.observer;

public class ShapeObserver {
    private final String name;

    public ShapeObserver(String name) {
        this.name = name;
    }

    public void update(String message) {
        IO.println(name + " 이(가) 알림을 받았습니다 : " + message);
    }
}
