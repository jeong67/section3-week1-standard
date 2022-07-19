package com.codestatse.member;

import com.codestatse.member.dto.MemberPatchDto;
import com.codestatse.member.dto.MemberPostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController //REST API의 리소스를 처리하기 위한 API 엔드 포인트로 동작함을 정의 , SpringBean 으로 등록
@RequestMapping("/v1/members/")// 핸들러 메서드를 매핑해줌 , 공통 URL 설정
public class MemberController {

    @PostMapping
    public ResponseEntity postMember(@RequestBody MemberPostDto memberPostDto) {

        return new ResponseEntity<>(memberPostDto, HttpStatus.CREATED);
    }

    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember (@PathVariable("member-id") long memberId,
                                      @RequestBody MemberPatchDto memberPatchDto) {
      memberPatchDto.setMemberId(memberId);
      memberPatchDto.setPhone("010-1111-2222");


        return new ResponseEntity<>(memberPatchDto,HttpStatus.OK);
    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") long memberId) {
        System.out.println("# memberId: " + memberId);

        // not implementation

        // (4) 리턴 값을 ResponseEntity 객체로 변경
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# get Members");

        // not implementation

        // (5) 리턴 값을 ResponseEntity 객체로 변경
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") long memberId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}