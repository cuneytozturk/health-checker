package com.capgemini.healthchecker.repository;

import com.capgemini.healthchecker.models.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {

}
