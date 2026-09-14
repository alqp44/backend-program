package me.ksm.springdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private  MemberRepository memberRepository;

    //멤버 테이블에 있는 모든 레코드들을 읽어서 변환
    @GetMapping
    public List<Member> getAllMembers() {
        return memberRepository.findAll();

    }
}
