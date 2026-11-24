package aop04.autoproxy;

public class Developer implements Worker {

    @Override
    public void daily() {
        IO.println("개발한다");
    }
}
