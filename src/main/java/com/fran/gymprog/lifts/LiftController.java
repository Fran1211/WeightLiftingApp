package com.fran.gymprog.lifts;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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
        Optional<Lifts> lifts = liftRepository.findById(id);
        if(lifts.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return lifts.get();
    }

    //post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    void create(@RequestBody Lifts lift){
        liftRepository.create(lift);
    }

    //put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@RequestBody Lifts lift, @PathVariable Integer id){
        liftRepository.update(lift,id);
    }

    //delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id){
        liftRepository.delete(id);
    }

}
