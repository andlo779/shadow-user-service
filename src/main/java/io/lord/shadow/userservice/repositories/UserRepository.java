package io.lord.shadow.userservice.repositories;

import io.lord.shadow.userservice.modell.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

     Optional<User> findUserById(String id);
}
