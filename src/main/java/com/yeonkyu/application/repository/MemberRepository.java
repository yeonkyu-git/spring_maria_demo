package com.yeonkyu.application.repository;

import com.yeonkyu.application.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final JdbcTemplate jdbcTemplate;

    public List<Member> findMembers() {
        System.out.println("MemberRepository.findMembers");
        return jdbcTemplate.query("SELECT * FROM MEMBER", memberDTORowMapper());
    }

    private RowMapper<Member> memberDTORowMapper() {
        return (rs, rowNum) -> {
            Member Member = new Member();
            Member.setUsername(rs.getString("USERNAME"));
            Member.setPassword(rs.getString("PASSWORD"));
            return Member;
        };
    }

}
