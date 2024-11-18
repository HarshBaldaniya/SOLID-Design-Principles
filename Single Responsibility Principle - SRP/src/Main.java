public class Main {
    public static void main(String[] args) {
        User user = new User("Harsh Baldaniya", "harshkumar.baldaniya@ei.study");
        UserRepository userRepository = new UserRepository();
        EmailService emailService = new EmailService();

        // Save the user to the database
        userRepository.save(user);

        // Send a welcome email
        emailService.sendWelcomeEmail(user);
    }
}
