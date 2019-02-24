package io.lord.shadow.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/user/{id}")
    public @ResponseBody User getUserById(@PathVariable String id) {
        return service.findUserById(id);
    }

    @PostMapping("/user")
    public @ResponseBody User createNewUser(@RequestBody User user) {
        return service.addNewUser(user);
    }

    @GetMapping("/user")
    public @ResponseBody List<User> getAllUsers() {
        return service.findAllUsers();
    }
}
