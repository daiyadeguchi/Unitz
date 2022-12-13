package com.daiyadeguchi.unitzapi.model.bootstrap;

import com.daiyadeguchi.unitzapi.model.User;
import com.daiyadeguchi.unitzapi.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserBootstrap {

    private static final Logger log = LoggerFactory.getLogger(UserBootstrap.class);

    @Bean
    CommandLineRunner initUserDatabase(UserRepository userRepository) {
        return args -> {
            log.info("Preloading " + userRepository.save(new User("Daiya",
                    "Deguchi",
                    false,
                    "MATH",
                    07341233,
                    93489927,
                    45,
                    100,
                    1)));

        };
    }

}
