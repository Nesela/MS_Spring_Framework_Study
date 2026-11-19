package design03.behavior.template_method;

public class CircleGenerator extends ShapeGenerator {

    @Override
    protected Shape createShape() {
        IO.println("원 생성");
        return new Circle(2,3,4);
    }
}
