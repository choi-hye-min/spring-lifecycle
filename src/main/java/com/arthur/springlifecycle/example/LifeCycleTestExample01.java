package com.arthur.springlifecycle.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

/**
 * Spring에 기본적으로 제공해주는 InitializingBean 인터페이스를 이용해서 초기화 작업을 할 수 있다
 */
@Slf4j
@Service
public class LifeCycleTestExample01 implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        // Bean 초기화작업 수행
        log.warn(this.getClass().getName()+" 초기화 수행");
    }
}
