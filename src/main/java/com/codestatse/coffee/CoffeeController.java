package com.codestatse.coffee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //REST API의 리소스를 처리하기 위한 API엔드포인트로 동작함 , SPRING BEAN에 추가
@RequestMapping("/v1/coffees") //공통 URL 설정 , 핸들러 메서드를 매핑
public class CoffeeController {
}
