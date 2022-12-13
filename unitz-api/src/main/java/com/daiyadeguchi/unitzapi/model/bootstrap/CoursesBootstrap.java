package com.daiyadeguchi.unitzapi.model.bootstrap;

import com.daiyadeguchi.unitzapi.model.Courses;
import com.daiyadeguchi.unitzapi.repository.CoursesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoursesBootstrap {

    private static final Logger log = LoggerFactory.getLogger(CoursesBootstrap.class);

    @Bean
    CommandLineRunner initCoursesDatabase(CoursesRepository coursesRepository) {
        return args -> {
            log.info("Preloading " + coursesRepository.save(new Courses("MATH101", "Introduction to Algebra", 3)));
            log.info("Preloading " + coursesRepository.save(new Courses("ENG101", "Intro to English Literature", 3)));
        };
    }

}
