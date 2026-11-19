package design03.behavior.strategy;

public class ShapeRenderer {
    private DrawStrategy strategy;

    public void  setStrategy(DrawStrategy strategy){
        this.strategy = strategy;
    }

    public void draw(Shape shape) {
        strategy.draw(shape);
    }
}
