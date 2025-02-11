package com.fran.gymprog.lifts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LiftController {

    private final LiftRepository liftRepository;

    public LiftController(LiftRepository liftRepository){
        this.liftRepository = liftRepository;
    }

    @GetMapping("/api/runs")
    List<Lifts> findAll(){
        return liftRepository.findAll();
    }

}
