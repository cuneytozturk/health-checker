package com.capgemini.healthchecker.models;

import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
public class WorkoutSchemeItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    private LocalTime scheduledTime;

    private String repsnsets;


    public LocalTime getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(LocalTime scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getRepsnsets() {
        return repsnsets;
    }

    public void setRepsnsets(String repsnsets) {
        this.repsnsets = repsnsets;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
