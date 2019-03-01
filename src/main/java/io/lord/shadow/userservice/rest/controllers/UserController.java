package io.lord.shadow.userservice.rest.controllers;

import io.lord.shadow.userservice.modell.User;
import io.lord.shadow.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public @ResponseBody
    User getUserById(@PathVariable @NotNull String id) {
        return service.findUserById(id);
    }

    @PostMapping
    public @ResponseBody User createNewUser(@RequestBody @NotNull User user) {
        return service.addNewUser(user);
    }

    @GetMapping
    public @ResponseBody List<User> getAllUsers() {
        return service.findAllUsers();
    }
}
