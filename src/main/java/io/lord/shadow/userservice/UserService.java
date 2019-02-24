package io.lord.shadow.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {


    @Autowired
    private UserRepository repository;

    public User findUserById(String id) {
        return repository.findUserById(id);
    }

    public User addNewUser(User user) {
        return repository.save(user);
    }

    public List<User> findAllUsers() {
        return repository.findAll();
    }
}
