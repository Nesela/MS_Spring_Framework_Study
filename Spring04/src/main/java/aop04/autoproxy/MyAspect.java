package aop04.autoproxy;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before("execution(public void *(..))")
    public void before(JoinPoint join) {
        IO.println("출근한다.");
    }

    @After("execution(public * aop04.autoproxy.*.*(..))")
    public void after(JoinPoint join) {
        IO.println("퇴근한다.");
    }

    @AfterThrowing("execution(public * * ())")
    public void afterTrowing(JoinPoint join) {
        IO.println("주말이었다...");
    }
}
