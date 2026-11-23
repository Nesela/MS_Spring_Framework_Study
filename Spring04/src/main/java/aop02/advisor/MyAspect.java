package aop02.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jspecify.annotations.Nullable;

public class MyAspect implements MethodInterceptor {
    @Override
    public @Nullable Object invoke(MethodInvocation invocation) throws Throwable {
        Object target = null;

        IO.println("출근한다");

        try {
            target = invocation.proceed();
        } catch (Exception e){
            IO.println("주말이었다...");
        } finally {
            IO.println("퇴근한다.");
        }

        return target;
    }
}
