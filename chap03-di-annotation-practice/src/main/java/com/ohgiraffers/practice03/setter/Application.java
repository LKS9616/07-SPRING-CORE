package com.ohgiraffers.practice03.setter;

import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.practice01.field.MemberController;
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
    }
}
