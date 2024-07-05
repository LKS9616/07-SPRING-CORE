package com.ohgiraffers.practice02.contructor;

import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.practice01.field.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    @Autowired
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    private MemberDAO memberDAO;

    public List<MemberDTO> selectMember() {
        Map<Long, MemberDTO> memberMap = memberDAO.selectMember();
        List<MemberDTO> memberList = new ArrayList<>(memberMap.values());
        return memberList;
    }
}
