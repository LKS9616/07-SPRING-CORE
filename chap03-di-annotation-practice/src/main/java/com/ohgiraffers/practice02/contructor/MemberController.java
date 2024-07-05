package com.ohgiraffers.practice02.contructor;

import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.practice01.field.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MemberController {
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    private MemberService memberService;

    public List<MemberDTO> selectMember() {
        return memberService.selectMember();
    }

}
