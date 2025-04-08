package com.capgemini.healthchecker.controller;

import com.capgemini.healthchecker.models.WorkoutSchemeItem;
import com.capgemini.healthchecker.repository.WorkoutRepository;
import org.hibernate.jdbc.Work;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WorkoutController {

    private final WorkoutRepository workoutRepository;

    public WorkoutController(WorkoutRepository workoutRepository) {
        this.workoutRepository = workoutRepository;
    }

    @GetMapping("/api/workout")
    public List<WorkoutSchemeItem> getWorkout() {
        return workoutRepository.findAll();
    }

    @PostMapping("/api/workout")
    public String addWorkoutItem(@RequestBody WorkoutSchemeItem workoutSchemeItem) {
        workoutRepository.save(workoutSchemeItem);
        return "Workout added successfully!";
    }
}
