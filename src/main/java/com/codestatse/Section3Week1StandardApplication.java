package com.codestatse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Component가 붙은 클래스를 검색 후 Spring Bean으로 등록, @Configuration이 붙은 클래스를 검색 후 Spring Bean으로 추가 등록
public class Section3Week1StandardApplication {

	public static void main(String[] args) {
		SpringApplication.run(Section3Week1StandardApplication.class, args);
	} //Spring 애플리케이션을 부트스트랩(여러가지 설정 작업을 수행하여 실행 가능한 애플리케이션으로 만듬)하고 실행

}
