package com.spring.core.basic.discount;

import com.spring.core.basic.member.Grade;

//정액 할인 정책 구현체
//역할: VIP회원에게만 고정된 금액을 매번 할인해서 계산액을 알려준다.
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
