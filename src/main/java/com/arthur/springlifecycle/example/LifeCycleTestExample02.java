package com.arthur.springlifecycle.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * PostConstruct은 JSR-250 스펙이기 때문에 JSR-250을 구현한 다른 프레임워크 혹은 라이브러리를 사용해 된다. 좀 더 Spring에 의존적이지 않는 장점이 있다.
 */
@Slf4j
@Service
public class LifeCycleTestExample02 {

    /**
     * 파라미터가 존재하면 에러가 발생한다.
     * return type이있지만 사용되지 않는다.
     */
    @PostConstruct
    public void postConstruct(){
        log.warn(this.getClass().getName()+" 초기화 수행");
    }
}
