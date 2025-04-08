package com.capgemini.healthchecker.repository;

import com.capgemini.healthchecker.models.WorkoutSchemeItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutRepository extends JpaRepository<WorkoutSchemeItem, Long> {

}
