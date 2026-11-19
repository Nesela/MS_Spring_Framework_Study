package design02.structural.flyweight;

public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int Radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int r) {
        this.Radius = Radius;
    }


    @Override
    public void draw() {
        IO.println(String.format("%s 색의 원 그리기 {%d, %d, %d}", color, x, y, Radius));
    }
}
