package design03.behavior.iterator;

public class MainMethod {
    void main() {
        ShapeCollection collection = new ShapeCollection();
        collection.addShape(new Circle(2,3,4));
        collection.addShape(new Square(5,6,7));

        for (Shape shape : collection) {
            shape.draw();
        }
        /*
        iterator pattern : 컬렉션 내부의 데티어구조를 노출하지 않고, 컬렉션 요소에 순차 접근
        - Aggregate : 요소들을 보관하는 컬렉션 인터페이스
        - ConcreteAggregate : 실제 컬렉션 구현체
        - Iterator : 요소 순회를 위한 인터페이스 (Iteragtor)
        - ConcreteIterator : 실제 순회 기능 구현체 (ArrayList의 Iterator)
        - Element : 컬렌셕에 저장되는 요소
         */
    }
}
