package shop.mtcoding.buyer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndecController {
    @GetMapping("/test")
    public String index() {
        return "test";
    }
}
