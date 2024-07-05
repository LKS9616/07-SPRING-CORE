package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.practice01.field");

        MemberController memberController = context.getBean(MemberController.class);

        List<MemberDTO> memberDTO = memberController.selectMember();

        for(MemberDTO member : memberDTO){
            System.out.println(member);
        }
//        MemberController 타입의 bean 객체를 IoC Container 에서 꺼내 selectMember 메소드를 호출하고 반환 받은 결과를 콘솔에 출력한다.
    }
}
