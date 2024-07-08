package com.ohgiraffers.practice01.bean;

import lombok.Data;

@Data
public class InitDestoryBean {

    public void init() {
        System.out.println("init 작업이 실행되었습니다.");
    }

    public void destroy() {
        System.out.println("destroy 작업이 실행되었습니다.");
    }
}
