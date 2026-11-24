package aop06.componet;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {


    @Before("execution(public * * (..))")
    public void before(JoinPoint join) {
        IO.println("출근한다");
    }

    @After("execution(public * * (..))")
    public void after(JoinPoint join) {
        IO.println("퇴근한다");
    }
}
