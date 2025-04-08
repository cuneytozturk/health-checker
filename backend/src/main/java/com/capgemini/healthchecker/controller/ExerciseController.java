package com.capgemini.healthchecker.controller;


import com.capgemini.healthchecker.repository.ExerciseRepository;
import com.capgemini.healthchecker.models.Exercise;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {

    private final ExerciseRepository exerciseRepository;

    public ExerciseController(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }
    
    @GetMapping("/getall")
    public String getAllExercises() {
        return exerciseRepository.findAll().toString();
    }

    @PostMapping("/add")
    public String addExercise(@RequestBody Exercise exercise) {
        exerciseRepository.save(exercise);
        return "Exercise added successfully!";
    }
}
