package com.arthur.springlifecycle.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LifeCycleTestExample03 {
    public void init(){
        log.warn(this.getClass().getName()+" 초기화 수행");
    }
}