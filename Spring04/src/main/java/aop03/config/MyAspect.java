package aop03.config;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    public void before(JoinPoint join) {
        IO.println(join.getTarget().getClass());
        IO.println(join.getSignature().getName());
        IO.println("출근한다");
    }

    public void after(JoinPoint join) {
        IO.println("퇴근한다.");
    }
}
