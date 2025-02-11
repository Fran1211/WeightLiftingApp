package com.fran.gymprog.lifts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/lifts")
public class LiftController {

    private final LiftRepository liftRepository;

    public LiftController(LiftRepository liftRepository){
        this.liftRepository = liftRepository;
    }

    @GetMapping()
    List<Lifts> findAll(){
        return liftRepository.findAll();
    }
    @GetMapping("/{id}")
    Lifts findById(@PathVariable Integer id){
        return liftRepository.findById(id);
    }

}
