package com.fran.gymprog.lifts;
import java.time.LocalDate;
public record Lifts(ExerciseType exercise,
                    double weight,
                    int reps,
                    String date) {}
