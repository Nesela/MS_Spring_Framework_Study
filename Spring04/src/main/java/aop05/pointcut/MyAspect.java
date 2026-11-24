package aop05.pointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Pointcut("execution(public * * (..))")
    public void myPoint() {

    }

    @Before("myPoint()")
    public void before(JoinPoint join) {
        IO.println("출근한다");
    }

    @After("myPoint()")
    public void after(JoinPoint join) {
        IO.println("퇴근한다");
    }
}
