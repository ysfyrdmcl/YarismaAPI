package com.example.yarismaprojesi.utility;

import com.example.yarismaprojesi.repository.UserRepository;
import com.example.yarismaprojesi.repository.entity.User;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class AdminImplement {
    private final UserRepository userRepository;

    public AdminImplement(UserRepository userRepository){
        this.userRepository = userRepository;
        Optional<User> user = this.userRepository.findByUsernameAndPassword("admin","admin");
        if(user.isEmpty())
            this.userRepository.save(User.builder()
                    .username("admin")
                    .password("admin")
                    .build());
    }
}
