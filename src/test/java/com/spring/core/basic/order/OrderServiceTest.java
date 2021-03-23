package com.spring.core.basic.order;

import com.spring.core.basic.member.Grade;
import com.spring.core.basic.member.Member;
import com.spring.core.basic.member.MemberService;
import com.spring.core.basic.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    @DisplayName("VIP회원은 주문이 생성될 때 정률할인을 적용받아야 한다.")
    void vip_got_rate_discount() {

        //given
        Member member = new Member(1L, "김철수", Grade.VIP);
        memberService.join(member);

        //when
        Order order = orderService.createOrder(
                member.getId(), "셔츠", 30000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(6000);

    }

}
