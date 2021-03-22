package com.spring.core.basic.member;

import java.awt.*;
import java.sql.SQLOutput;

public class MemberMain {

    public static void main(String[] args) {

        MemberService memberService = new MemberService();

        //회원가입 대상 객체
        Member member = new Member(id:1L, name:"김철수", Grade.VIP)
        Member member2 = new Member(id:2L, name:"박영희", Grade.VIP)
        memberService.join(member);

        //저장소에 실제 저장
        memberService.join(member);
        memberService.join(member2);

        //저장소에서 객체 조회
        memberService.findMember(1L);
        System.out.println("findMeber = " + findMember);
        memberService.findMember(2L);
        System.out.println("findMeber = " + findMember);
    }
}
