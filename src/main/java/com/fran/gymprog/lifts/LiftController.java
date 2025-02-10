package com.fran.gymprog.lifts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LiftController {

    @GetMapping("/hello")
    String home() {
           return "Hello Lifter";
    }


}
