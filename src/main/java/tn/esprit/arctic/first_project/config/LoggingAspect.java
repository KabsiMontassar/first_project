package tn.esprit.arctic.first_project.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LoggingAspect {


    @Before("execution(* tn.esprit.arctic.first_project.services.impl.ClientService.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }



    @After("execution(* tn.esprit.arctic.first_project.services.impl.ClientService.*(..))")
    public void logMethodExit(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Exiting method " + name + " : ");
    }

    @Around("execution(* tn.esprit.arctic.first_project.services.impl.ClientService.*(..))")
    public Object logMethodExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        String name = joinPoint.getSignature().getName();
        log.info("Execution time of method " + name + " : " + elapsedTime + " ms");
        return result;
    }

    @AfterReturning(pointcut = "execution(* tn.esprit.arctic.first_project.services.impl.ClientService.*(..))", returning = "result")
    public void logMethodReturn(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        log.info("Method " + name + " returned: " + result);
    }

    @AfterThrowing(pointcut = "execution(* tn.esprit.arctic.first_project.services.impl.ClientService.*(..))", throwing = "error")
    public void logMethodException(JoinPoint joinPoint, Throwable error) {
        String name = joinPoint.getSignature().getName();
        log.error("Method " + name + " threw an exception: " + error);
    }


}
