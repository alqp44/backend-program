package me.ksm.springdeveloper;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Service
public class  MemberService {
    @Autowired
    private  MemberRepository memberRepository;

    //멤버 테이블에 있는 모든 레코드들을 읽어서 변환
    @GetMapping("/member")
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    // 멤버 저장
    public Member saveMember(Member member) {
        return memberRepository.save(member); // insert into member values(...); <-- 이거 만들어줌
    }
}
