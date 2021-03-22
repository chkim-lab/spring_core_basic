package com.spring.core.basic.member;

//회원 서비스 구현체
//역할: 적당한 회원 저장소에 저장 명령을 내리는 기능
public class MemberServiceImpl implements MemberService{

    private MemberRepository memberRepository = new MemberRepository() {
        @Override
        public void save(Member member) {
            memberRepository.save(member);
        }

        @Override
        public Member findById(Long memberId) {
            return memberRepository.findById(memberId);
        }
    }
}
