package com.codestatse.order;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {
    @PostMapping
    public String postOrder(@RequestParam("memberId") long memberId, @RequestParam("coffeeId") long coffeeId) {
        System.out.println( "# memberId: " + memberId);
        System.out.println( "# coffeeId: " + coffeeId);

        String response =
                "{\"" +
                        "memberId\":\""+memberId+"\","+
                        "\"coffeeId\":\""+coffeeId+"\""+
                        "}";
        return response;
    }

    @GetMapping("/{order-id}")
    public String getOrder(@PathVariable("order-id") long orderId){
        System.out.println("# orderId" + orderId);

        //not implementation
        return null;
    }

    @GetMapping
    public String getOrders() {
        System.out.println("# get Orders");

        //not implementation
        return null;
    }

}
