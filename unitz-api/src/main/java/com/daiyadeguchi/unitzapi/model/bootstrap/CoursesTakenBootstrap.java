package com.daiyadeguchi.unitzapi.model.bootstrap;

import com.daiyadeguchi.unitzapi.model.CoursesTaken;
import com.daiyadeguchi.unitzapi.repository.CoursesTakenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoursesTakenBootstrap {

    private static final Logger log = LoggerFactory.getLogger(CoursesTakenBootstrap.class);

    @Bean
    CommandLineRunner initCoursesTakenDatabase(CoursesTakenRepository coursesTakenRepository) {
        return args -> {
            log.info("Preloading " + coursesTakenRepository.save(new CoursesTaken(1, 1)));
            log.info("Preloading " + coursesTakenRepository.save(new CoursesTaken(1, 2)));
        };
    }

}
