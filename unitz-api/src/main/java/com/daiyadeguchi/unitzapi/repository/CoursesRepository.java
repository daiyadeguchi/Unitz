package com.daiyadeguchi.unitzapi.repository;

import com.daiyadeguchi.unitzapi.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses, Long> {
}
