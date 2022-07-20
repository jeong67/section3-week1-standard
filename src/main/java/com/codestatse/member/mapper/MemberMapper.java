package com.codestatse.member.mapper;

import com.codestatse.member.Member;
import com.codestatse.member.dto.MemberPatchDto;
import com.codestatse.member.dto.MemberPostDto;
import com.codestatse.member.dto.MemberResponseDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface MemberMapper {
    Member memberPostDtoToMember (MemberPostDto memberPostDto);
    Member memberPatchDtoToMember (MemberPatchDto memberPatchDto);
    MemberResponseDto memberToMemberResponseDto (Member member);
}
