package com.ohgiraffers.common;

public interface Account {

    // 잔액조회
    String getBalance();

    // 입증
    String deposit(int money);

    // 출금
    String withDraw(int money);
}
