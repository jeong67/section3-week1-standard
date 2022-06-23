package com.codestatse.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController //REST API의 리소스를 처리하기 위한 API 엔드 포인트로 동작함을 정의 , SpringBean 으로 등록
@RequestMapping(value = "/v1/members/")// 핸들러 메서드를 매핑해줌 , 공통 URL 설정
public class MemberController {

    @PostMapping
    public ResponseEntity postMember(@RequestParam("email") String email,
                                     @RequestParam("name") String name,
                                     @RequestParam("phone") String phone) {
        // (2) JSON 문자열 수작업을 Map 객체로 대체
        Map<String, String> map = new HashMap<>();
        map.put("email", email);
        map.put("name", name);
        map.put("phone", phone);

        // (3) 리턴 값을 ResponseEntity 객체로 변경
        return new ResponseEntity<>(map, HttpStatus.CREATED);
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
}