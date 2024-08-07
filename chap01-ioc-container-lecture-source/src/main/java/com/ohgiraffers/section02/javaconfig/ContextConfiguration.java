package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class ContextConfiguration {

    @Bean("member")
    public MemberDTO getMember() {
        System.out.println("getMember 호출함...");
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }
}
