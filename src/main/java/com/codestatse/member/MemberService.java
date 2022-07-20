package com.codestatse.member;



import java.util.List;

public class MemberService {
    public Member createMember (Member member) {
        Member createdMember = member;
        return createdMember;
    }

    public Member updateMember (Member member) {
        Member updatedMember = member;
        return updatedMember;
    }

    public Member findMember (long memberId) {
        Member member = new Member(1, "고양이", "abc@defg", "010-1111-2222");
        return member;
    }

    public List<Member> findMembers() {
      List<Member> members = List.of(
              new Member(1, "고양이", "abc@defg", "010-1111-2222"),
              new Member(2, "강아지", "cde@defg", "010-3333-4444")
      );

      return members;
    }

    public void deleteMember(long memberId) {

    }

}
