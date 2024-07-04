package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        /*
         * getBeanDefinitionNames : 스프링 컨테이너에서 생성된 bean들의 이름을 배열로 반환한다.
         * */
        String[] beanNames = context.getBeanDefinitionNames();
        for(String beanName : beanNames) {
            System.out.println("beanName : " + beanName);
        }

        BoardDAO boradDAO = context.getBean("boardDAO", BoardDAO.class);

        System.out.println(boradDAO.selectBoard(1L));

        System.out.println(boradDAO.insertBoard(new BoardDTO(3L, "스프링 수업 엄청 기다렸어요!", "많은 걸 얻어 갈 수 있는 시간 되면 좋겠어요", "봄이올까요")));
        System.out.println(boradDAO.selectBoard(3L));
    }
}
