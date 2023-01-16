package com.daiyadeguchi.unitzapi.controllers;

import com.daiyadeguchi.unitzapi.model.Courses;
import com.daiyadeguchi.unitzapi.repository.CoursesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {

    private final CoursesRepository coursesRepository;


    public CoursesController(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    @GetMapping("/courses")
    List<Courses> all() {
        return coursesRepository.findAll();
    }

    @GetMapping("/courses/{id}")
    Courses findCourse(@PathVariable Long id) throws Exception {
        return coursesRepository.findById(id)
                .orElseThrow(() -> new Exception("No course found with the id: " + id));
    }

    @PostMapping("/courses")
    Courses newCourse(@RequestBody Courses newCourse) {
        return coursesRepository.save(newCourse);
    }

    @PutMapping("/courses/{id}")
    Courses editCourse(@RequestBody Courses newCourse, @PathVariable Long id) {
        return coursesRepository.findById(id)
                .map(course -> {
                    course.setName(newCourse.getName());
                    course.setDescription(newCourse.getDescription());
                    course.setUnits(newCourse.getUnits());
                    return coursesRepository.save(course);
                })
                .orElseGet(() -> {
                    newCourse.setId(id);
                    return coursesRepository.save(newCourse);
                });

    }

    @DeleteMapping("/courses/{id}")
    void deleteCourse(@PathVariable Long id) {
        coursesRepository.deleteById(id);
    }

}
