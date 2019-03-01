package io.lord.shadow.userservice.services;

import io.lord.shadow.userservice.exceptions.ResourceNotFoundException;
import io.lord.shadow.userservice.modell.User;
import io.lord.shadow.userservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {


    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User findUserById(final String id) {
        Optional<User> user = repository.findUserById(id);
        if (user.isEmpty()) {
            throw new ResourceNotFoundException("No user with id: " + id + " found");
        }
        return user.get();
    }

    public User addNewUser(User user) {
        return repository.save(user);
    }

    public List<User> findAllUsers() {

        List<User> users = repository.findAll();
        if(users.isEmpty()) {
            throw new ResourceNotFoundException("No users found");
        }
        return users;
    }
}
