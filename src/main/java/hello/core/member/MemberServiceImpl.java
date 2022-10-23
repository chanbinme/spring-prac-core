package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    /* 이 코드는 인터페이스뿐만 아니라 구현체까지 의존하는 문제가 있다 */
    private final MemberRepository memberRepository;

    /* 자동으로 의존관계를 주입해준다. */
    @Autowired // ac.getBean(MemberRepository.class)
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트 코드
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
