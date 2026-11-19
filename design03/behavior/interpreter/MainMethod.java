package design03.behavior.interpreter;

public class MainMethod {
    void main() {
        Shape circle = new Circle(1,2,3);
        Shape square = new Square(4,4,1);

        Expression area01 = new AreaExpression(circle);
        Expression area02 = new AreaExpression(square);
        IO.println("원의 넓이 : " + area01.evaluate());
        IO.println("사각형의 넓이 : " + area02.evaluate());

        Expression per01 = new PerimeterExpression(circle);
        Expression per02 = new PerimeterExpression(square);
        IO.println("원의 둘레 : " + per01.evaluate());
        IO.println("사각형의 둘레 :" + per02.evaluate());
        /*
        interpreter pattern : 정해진 문법이나 표현식을 객체로 구성하고, 해당 표현식을 해석
        - Expression : 표현식의 공통 인터페이스 (Expression)
        - Terminal / NonTerminal Expression : 문법을 구성하는 표현식 요소 (AreaExpression, PerimeterExpression)
        - Context : 표현식 해석에 필요한 외부 정보 (실습에 없음)
         */
    }
}
