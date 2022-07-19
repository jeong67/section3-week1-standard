package com.codestatse.coffee.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

public class CoffeePatchDto {
    private long coffeeId;
    @Pattern(regexp = "^(?=\\s*\\S).*$")
    private String korName;
    @Pattern(regexp = "^([A-Za-z])(\\s?[A-Za-z]).*$")
    @Pattern(regexp = "^(?=\\s*\\S).*$")
    private String engName;
    private int price;


    @Positive
    public long getCoffeeId() {
        return coffeeId;
    }

    public String getKorName() {
        return korName;
    }

    public String getEngName() {
        return engName;
    }

    public int getPrice() {
        return price;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
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
