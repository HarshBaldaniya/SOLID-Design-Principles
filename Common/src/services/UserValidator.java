package services;

// Validates the user's data
import models.User;

public class UserValidator {
    public void validate(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new IllegalArgumentException("User name is required.");
        }
        if (user.getEmail() == null || !user.getEmail().contains("@")) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        if (user.getPhoneNumber() == null || user.getPhoneNumber().length() != 10) {
            throw new IllegalArgumentException("Invalid phone number.");
        }
    }
}
