package com.fran.gymprog.lifts;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LiftRepository {

    private List <Lifts> lifts = new ArrayList<>();

    List<Lifts> findAll() {
        return lifts;
    }

    @PostConstruct
    private void init(){
        lifts.add(new Lifts(ExerciseType.BICEP_CURL, 30, 8, "02/11"));
        lifts.add(new Lifts(ExerciseType.OVERHEAD_PRESS, 25, 8, "02/11"));
    }

}
