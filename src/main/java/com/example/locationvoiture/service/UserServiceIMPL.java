package com.example.locationvoiture.service;
import org.springframework.security.crypto.bcrypt.BCrypt ;
import com.example.locationvoiture.entity.Role;
import com.example.locationvoiture.entity.User;
import com.example.locationvoiture.repo.UserRepo;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

@Service

public class UserServiceIMPL  implements  UserService {
    @Autowired
    UserRepo userRepo ;

    @Override
    public User Signup(User user) {
        user.setRole(Role.Utilisateur);
        // Hash the password using Bcrypt
        String hashedPassword = new BCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(hashedPassword);

        return userRepo.save(user);
    }

   @Override
    public Boolean login(User user) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User userbase = userRepo.findByEmail(user.getEmail());
        return (user != null && passwordEncoder.matches(user.getPassword(),userbase.getPassword()))  ;


         // Return null if login fails
    }
}
