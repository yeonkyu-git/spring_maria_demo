package com.yeonkyu.application.controller;

import com.yeonkyu.application.domain.Member;
import com.yeonkyu.application.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/")
    public String testRequest() {
        return "ok";
    }

    @GetMapping("/members")
    public List<Member> findMembers() {
        System.out.println("MemberController.findMembers");
        return memberService.getMember();
    }
}
