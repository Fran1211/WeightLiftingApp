package com.fran.gymprog.lifts;

public record Lifts(ExerciseType exercise,
                    double weight,
                    int reps,
                    String date) {
        public int getExerciseId() {
        return exercise.getId();
    }

}
