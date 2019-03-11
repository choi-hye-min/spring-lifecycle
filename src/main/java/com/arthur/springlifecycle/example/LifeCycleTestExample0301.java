package com.arthur.springlifecycle.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Bean init method 참고바람
 * https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch02s02.html
 */
@Slf4j
@Component
public class LifeCycleTestExample0301 {

    // LifeCycleTestExample03의 init()을 호출
    @Bean(initMethod = "init")
    public LifeCycleTestExample03 lifeCycleTestExample03(){
        log.warn(this.getClass().getName()+" 호출");

        return new LifeCycleTestExample03();
    }
}
