package com.skillmatch.backend.service;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Aspect
@Slf4j
public class KpiServiceImpl implements IKpiService {

    private final Map<String, List<Long>> executionTimes = new HashMap<>();

    @Around("execution(* com.skillmatch.backend.service.ProjetoServiceImpl.register(..)) || " +
            "execution(* com.skillmatch.backend.service.ContratanteServiceImpl.register(..)) || " +
            "execution(* com.skillmatch.backend.service.FreelancerServiceImpl.register(..))")
    public Object measureExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object returnValue = joinPoint.proceed();

        long end = System.currentTimeMillis();
        long duration = end - start;

        String methodName = joinPoint.getSignature().getDeclaringType().getSimpleName() + "." + joinPoint.getSignature().getName();
        log.info("Tempo de execução de {}: {} ms", methodName, duration);

        addExecutionTime(methodName, duration);

        return returnValue;
    }

    private void addExecutionTime(String methodName, long duration) {
        executionTimes.computeIfAbsent(methodName, k -> new ArrayList<>()).add(duration);
    }

    private double getAverageExecutionTime(String methodName) {
        List<Long> times = executionTimes.get(methodName);
        if (times == null || times.isEmpty()) {
            return 0;
        }
        long total = times.stream().mapToLong(Long::longValue).sum();
        return (double) total / times.size();
    }

    @Override
    public double getTempoDeRespostaCriacaoDeContratante() {
        return getAverageExecutionTime("ContratanteServiceImpl.register");
    }

    @Override
    public double getTempoDeRespostaCriacaoDeProjeto() {
        return getAverageExecutionTime("ProjetoServiceImpl.register");
    }

    @Override
    public double getTempoDeRespostaCriacaoDeFreelancer() {
        return getAverageExecutionTime("FreelancerServiceImpl.register");
    }
}
