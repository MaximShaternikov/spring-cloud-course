package com.example.reactive.util;

import com.example.reactive.model.User;
import com.example.reactive.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Component
@AllArgsConstructor
public class InitData {
    private final UserRepository userRepository;

    @PostConstruct
    void init() {
        userRepository.deleteAll().block();

        for (int i = 0; i < 97; i++) {
            Mono<User> savedUser = userRepository.save(generateRandomUser());
            savedUser.block();
        }
    }

    private User generateRandomUser() {
        String randomId = UUID.randomUUID().toString();
        String randomEmail = String.format("email%s@gmail.com", randomId);
        return new User(randomId, randomEmail);
    }
}
