package aop03.config;

public class Engineer implements Worker {

    @Override
    public void daily() {
        IO.println("운영한다");
    }
}
