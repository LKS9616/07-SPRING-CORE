package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    @Autowired
    private MemberDAO memberDAO;

    public List<MemberDTO> selectMember() {
        Map<Long, MemberDTO> memberMap = memberDAO.selectMember();
        List<MemberDTO> memberList = new ArrayList<>(memberMap.values());
        return memberList;
    }
//Map<key, value> map이 있다고 가정하면
//
//
//List<key> list = new ArrayList<key>(map.keySet());
//or
//
//List<value> list = new ArrayList<value>(map.values());

    }

