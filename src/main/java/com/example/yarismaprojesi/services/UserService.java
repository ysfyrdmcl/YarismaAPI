package com.example.yarismaprojesi.services;
import com.example.yarismaprojesi.dto.request.RegisterRequestDto;
import com.example.yarismaprojesi.mapper.UserMapper;
import com.example.yarismaprojesi.repository.UserRepository;
import com.example.yarismaprojesi.repository.entity.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends ServiceManager<User,Long>{
    private final UserRepository userRepository;

    UserMapper userMapper = UserMapper.INSTANCE;

    public UserService(UserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;

    }

    public Optional<User> doLogin(String username,String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public boolean register(RegisterRequestDto dto){
        Optional<User> user=userRepository.findByUsername(dto.getUsername());
        if(user.isPresent()){
            return false;
        }
        else {

            userRepository.save(User.builder()
                            .username(dto.getUsername())
                            .password(dto.getPassword())
                    .build());

            //userRepository.save(userMapper.toUser(dto));
            return true;
        }
    }
}
