package aop05.pointcut;

public class Developer implements Worker {

    @Override
    public void daily() {
        IO.println("개발한다");
    }
}
