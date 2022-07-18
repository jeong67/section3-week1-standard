package com.codestatse.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //REST API의 리소스를 처리하기 위한 API엔드포인트로 동작함 , SPRING BEAN에 추가
@RequestMapping("/v1/coffees") //공통 URL 설정 , 핸들러 메서드를 매핑
public class CoffeeController {

    public ResponseEntity postCoffee(@RequestParam("korName") String korName,
                                    @RequestParam("engName") String engName,
                                    @RequestParam("price") int price) {

        Map<String, Object> map = new HashMap<>();
        map.put("korName", korName);
        map.put("engName", engName);
        map.put("price", price);

        return new ResponseEntity<>(map, HttpStatus.CREATED);

    }

}
