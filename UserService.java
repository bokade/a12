package com.example.services;

import com.example.User;
import com.example.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {


//    @Autowired
//    MongoTemplate mongoTemplate;
//    public User saveUser(User user) {
//        User user1 = new User();
//        user1.setName(user.getName());
//        user1.setEmail(user.getEmail());
//        user1.setPassword(user.getPassword());
//        user1.setCreatedOn(Instant.now());
//        user1.setModifiedOn(Instant.now());
//       return mongoTemplate.save(user1,"user");
//
//    }


    private final UserRepository userRepository;

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }



    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    public Optional<User> findByIdAndVersion(String id, int version) {
        return userRepository.findByIdAndVersion(id, version);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
