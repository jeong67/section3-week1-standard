package com.codestatse.coffee;

import java.util.List;

public class CoffeeService {
    public Coffee createCoffee (Coffee coffee) {
        Coffee createdCoffee = coffee;
        return createdCoffee;

    }

    public Coffee updateCoffee (Coffee coffee) {
        Coffee updatedCoffee = coffee;
        return updatedCoffee;
    }

    public Coffee findCoffee (long coffeeId) {
        Coffee coffee = new Coffee(1, "아메리카노", "Americano", 3500);
        return coffee;
    }

    public List<Coffee> findCoffees() {
        List<Coffee> coffees = List.of (
                new Coffee(1,"아메리카노","Americano",3500),
                new Coffee(2,"우유","Milk",2800)
        );
        return coffees;
    }


    public void deleteCoffee (long coffeeId) {

    }

}
