package aop06.componet;

import org.springframework.stereotype.Component;

@Component
public class Developer implements Worker {

    @Override
    public void daily() {
        IO.println("개발한다");
    }
}
