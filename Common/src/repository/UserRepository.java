package repository;

import models.User;

// Simulates database operations
public class UserRepository {
    public void save(User user) {
        System.out.println("Saving user " + user.getName() + " to the database.");
    }
}
