package com.codestatse.coffee;

import com.codestatse.coffee.dto.CoffeePatchDto;
import com.codestatse.coffee.dto.CoffeePostDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController //REST API의 리소스를 처리하기 위한 API엔드포인트로 동작함 , SPRING BEAN에 추가
@RequestMapping("/v1/coffees") //공통 URL 설정 , 핸들러 메서드를 매핑
public class CoffeeController {

    public ResponseEntity postCoffee(@RequestBody CoffeePostDto coffeePostDto) {

        return new ResponseEntity<>(coffeePostDto, HttpStatus.CREATED);

    }

    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee (@PathVariable("coffee-id") long coffeeId,
                                       @RequestBody CoffeePatchDto coffeePatchDto) {
        coffeePatchDto.setCoffeeId(coffeeId);
        coffeePatchDto.setKorName("바닐라라떼 빈");

        return new ResponseEntity<>(coffeePatchDto,HttpStatus.OK);
    }

    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long coffeeId) {
        System.out.println("# coffeeId: " + coffeeId);

        // not implementation

        // (4) 리턴 값을 ResponseEntity 객체로 변경
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getCoffees() {
        System.out.println("# get Coffees");

        // not implementation

        // (5) 리턴 값을 ResponseEntity 객체로 변경
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{coffee-id}")
    public ResponseEntity deleteCoffee(@PathVariable("coffee-id") long coffeeId) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
