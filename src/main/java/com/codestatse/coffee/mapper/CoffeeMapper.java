package com.codestatse.coffee.mapper;

import com.codestatse.coffee.Coffee;
import com.codestatse.coffee.dto.CoffeePatchDto;
import com.codestatse.coffee.dto.CoffeePostDto;
import com.codestatse.coffee.dto.CoffeeResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CoffeeMapper {
    Coffee coffeePostDtoToCoffee (CoffeePostDto coffeePostDto);
    Coffee coffeePatchDtoToCoffee (CoffeePatchDto coffeePatchDto);
    CoffeeResponseDto coffeeToCoffeeResponseDto (Coffee coffee);
}
