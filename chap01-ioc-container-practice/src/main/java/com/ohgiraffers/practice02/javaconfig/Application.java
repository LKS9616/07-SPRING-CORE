package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        BoardDTO board2 = context.getBean("boardDTO", BoardDTO.class);

        // @Bean("이름")을 이용해서 ID를 메소드명과 다르게 지정해줄 수 있다.

        System.out.println(board2);

    }
}
