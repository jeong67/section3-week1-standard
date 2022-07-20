package com.codestatse.member.mapper;

import com.codestatse.member.Member;
import com.codestatse.member.dto.MemberPatchDto;
import com.codestatse.member.dto.MemberPostDto;
import com.codestatse.member.dto.MemberResponseDto;
import org.springframework.stereotype.Component;


@Component
public class MemberMapperImpl implements MemberMapper{
    @Override
    public Member memberPostDtoToMember(MemberPostDto memberPostDto) {
       if (memberPostDto == null) {
           return null;
       } else {
           Member member = new Member();
           member.setName(memberPostDto.getName());
           member.setEmail(memberPostDto.getEmail());
           member.setPhone(memberPostDto.getPhone());
           return member;
       }
    }

    @Override
    public Member memberPatchDtoToMember(MemberPatchDto memberPatchDto) {
        if (memberPatchDto == null) {
            return null;
        } else {
            Member member = new Member();
            member.setMemberId(memberPatchDto.getMemberId());
            member.setName(memberPatchDto.getName());
            member.setEmail(memberPatchDto.getEmail());
            member.setPhone(memberPatchDto.getPhone());
            return member;
        }
    }

    @Override
    public MemberResponseDto memberToMemberResponseDto(Member member) {
        if (member == null) {
            return null;
        }else {
            long memberId = 0L;
            String name = null;
            String email = null;
            String phone = null;
            memberId = member.getMemberId();
            name = member.getName();
            email = member.getEmail();
            phone = member.getPhone();
            MemberResponseDto memberResponseDto = new MemberResponseDto(memberId,name,email,phone);
            return memberResponseDto;
        }
    }
}
