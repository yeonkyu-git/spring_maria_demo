package com.yeonkyu.application.service;

import com.yeonkyu.application.domain.Member;
import com.yeonkyu.application.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public List<Member> getMember() {
        System.out.println("MemberService.getMember");
        return memberRepository.findMembers();
    }
}
