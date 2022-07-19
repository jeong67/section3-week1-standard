package com.codestatse.coffee.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CoffeePostDto {
    @NotBlank
    private String korName;
    @NotBlank
    @Pattern(regexp ="^([A-Za-z])(\\s?[A-Za-z]).*$" )
    private String engName;
    @NotBlank
    @Min(value = 100)
    @Max(value = 50000)
    private int price;

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public int getPrice() {
        return price;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
