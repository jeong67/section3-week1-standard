package com.codestatse.coffee.mapper;

import com.codestatse.coffee.Coffee;
import com.codestatse.coffee.dto.CoffeePatchDto;
import com.codestatse.coffee.dto.CoffeePostDto;
import com.codestatse.coffee.dto.CoffeeResponseDto;

public class CoffeeMapperImpl implements CoffeeMapper{
    @Override
    public Coffee coffeePostDtoToCoffee(CoffeePostDto coffeePostDto) {
        if (coffeePostDto == null) {
            return null;
        } else {
            Coffee coffee = new Coffee();
            coffee.setKorName(coffeePostDto.getKorName());
            coffee.setEngName(coffeePostDto.getEngName());
            coffee.setPrice(coffeePostDto.getPrice());
            return coffee;
        }

    }

    @Override
    public Coffee coffeePatchDtoToCoffee(CoffeePatchDto coffeePatchDto) {
        if(coffeePatchDto == null) {
            return null;
        } else {
            Coffee coffee = new Coffee();
            coffee.setCoffeeId(coffeePatchDto.getCoffeeId());
            coffee.setKorName(coffeePatchDto.getKorName());
            coffee.setEngName(coffeePatchDto.getEngName());
            coffee.setPrice(coffeePatchDto.getPrice());
            return coffee;
        }
    }

    @Override
    public CoffeeResponseDto coffeeToCoffeeResponseDto(Coffee coffee) {
        if (coffee == null) {
            return null;
        } else {
            long coffeeId = 0l;
            String korName = null;
            String engName = null;
            int price = 0;
            coffeeId = coffee.getCoffeeId();
            korName = coffee.getKorName();
            engName = coffee.getEngName();
            price = coffee.getPrice();
            CoffeeResponseDto coffeeResponseDto = new CoffeeResponseDto(coffeeId,korName,engName,price);
            return coffeeResponseDto;

        }
    }
}
