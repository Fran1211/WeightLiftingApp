package com.fran.gymprog.lifts;

public enum ExerciseType {
    BENCH_PRESS(1),
    SQUAT(2),
    DEADLIFT(3),
    OVERHEAD_PRESS(4),
    BARBELL_ROW(5),
    PULL_UP(6),
    DIPS(7),
    LEG_PRESS(8),
    BICEP_CURL(9),
    TRICEP_EXTENSION(10);

    private final int id;

    ExerciseType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
