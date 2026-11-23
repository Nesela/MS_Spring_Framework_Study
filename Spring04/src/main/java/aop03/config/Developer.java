package aop03.config;

public class Developer implements Worker {

    @Override
    public void daily() {
        IO.println("개발한다");
    }
}
