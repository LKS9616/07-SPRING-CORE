package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Member;

@Configuration
public class ContextConfiguration {

@Bean("MemberDTO")
    public MemberDTO MemberGenerator () {
    return new MemberDTO(1L, "봄이올까요");
}

@Bean("BoardDTO")
    public BoardDTO BoardGenerator() {

    BoardDTO board = new BoardDTO();
    board.setId(1L);
    board.setContent("의존성 주입 연습");
    board.setTitle("게시글의 작성자 객체를 주입 받아볼게요!");
    board.setWriter(MemberGenerator());

    return board;

}

}
