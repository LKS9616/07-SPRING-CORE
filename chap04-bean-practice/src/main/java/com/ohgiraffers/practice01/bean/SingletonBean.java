package com.ohgiraffers.practice01.bean;

import lombok.Data;

@Data
public class SingletonBean {

    private String message;

    public SingletonBean(String message) {
        this.message = message;
    }


    public SingletonBean() {
    }

    public String getMessage() {
        return message;
    }

}
