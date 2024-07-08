package com.ohgiraffers.practice01.bean;

import lombok.Data;

@Data
public class PrototypeBean {

    private String message;

    public PrototypeBean () {

    }

    public PrototypeBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
