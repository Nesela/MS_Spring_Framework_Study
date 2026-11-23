package aop02.advisor;

public class Developer implements Worker{

    @Override
    public void daily() {
        IO.println("개발한다");
    }
}
