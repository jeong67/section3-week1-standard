package com.codestatse.member.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

public class MemberPatchDto {
    private long memberId;

    @Pattern(regexp = "^(?=\\s*\\S).*$", message = "회원 이름은 공백이 아니어야 합니다.")
    private String name;
    @Email
    private String email;
    @Pattern(regexp = "^(?=\\s*\\S).*$", message = "전화번호는 공백이 아니어야 합니다.")
    @Pattern(regexp = "^010-\\d{3,4}-\\d{4}$", message = "전화번호는 010으로 시작하는 11자리 숫자와 '-'로 구성되어야 합니다.")
    private String phone;

    public long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
