package com.fran.gymprog.lifts;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class LiftRepository {

    private List <Lifts> lifts = new ArrayList<>();

    List<Lifts> findAll() {
        return lifts;
    }

    Optional<Lifts> findById(Integer id){
        return lifts.stream().filter(lifts -> lifts.getExerciseId() == id).findFirst();
    }

    void create(Lifts lift){
        lifts.add(lift);
    }

    void update(Lifts lift, Integer id) {
        Optional<Lifts> existingLift = findById(id);
        if(existingLift.isPresent()){
            lifts.set(lifts.indexOf(existingLift.get()), lift);
        }
    }

    void delete(Integer id) {
        lifts.removeIf(lift -> lift.getExerciseId() == id);
    }

    @PostConstruct
    private void init(){
        lifts.add(new Lifts(ExerciseType.BICEP_CURL, 30, 8, "02/11"));
        lifts.add(new Lifts(ExerciseType.OVERHEAD_PRESS, 25, 8, "02/11"));
    }

}
