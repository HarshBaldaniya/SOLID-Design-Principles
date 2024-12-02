import factory.ServiceFactory;
import models.User;
import services.UserRegistrationService;

public class Main {
    public static void main(String[] args) {
        // Create a user instance
        User user = new User("Harsh Baldaniya", "harshkumar.baldaniya@ei.study", "9265707138");

        // Get the registration service from the factory
        UserRegistrationService registrationService = ServiceFactory.createUserRegistrationService();

        // Register the user and handle potential validation errors
        try {
            registrationService.registerUser(user);
        } catch (IllegalArgumentException e) {
            System.err.println("Registration failed: " + e.getMessage());
        }
    }
}
