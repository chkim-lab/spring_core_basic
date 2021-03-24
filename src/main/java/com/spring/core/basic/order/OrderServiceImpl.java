package com.spring.core.basic.order;

import com.spring.core.basic.discount.DiscountPolicy;
import com.spring.core.basic.discount.FixDiscountPolicy;
import com.spring.core.basic.discount.RateDiscountPolicy;
import com.spring.core.basic.member.Member;
import com.spring.core.basic.member.MemberRepository;
import com.spring.core.basic.member.MemoryMemberRepository;

//주문 서비스 구현체
//역할: 적당한 회원 저장소에서 회원 정보를 조회한 후
//      등급에 따라 적당한 할인정책에 의한 할인을 적용한 주문을 생성해야 함.
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;

//    private DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member findMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findMember, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
