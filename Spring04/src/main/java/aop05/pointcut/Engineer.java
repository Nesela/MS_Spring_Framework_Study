package aop05.pointcut;

public class Engineer implements Worker {

    @Override
    public void daily() {
        IO.println("운영한다");
    }
}
