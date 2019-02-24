package io.lord.shadow.userservice;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String email;

    public User() {

    }

    public User(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("User[id=%s, firstName='%s', lastName='%s', email='%s']", id, firstName, lastName, email);
    }

}
