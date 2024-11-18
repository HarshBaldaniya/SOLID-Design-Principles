## 1. Single Responsibility Principle (SRP)

Explanation: A class should only have one job. This makes it easier to change and maintain.

Scenario: We have a class for handling user details. It originally does too much by managing both user details and sending welcome emails. We'll separate these responsibilities.

### User.java

Explanation: The User class manages the user data, holding name and email. It only has one responsibility, which is storing user information.

### UserRepository.java

Explanation: The UserRepository class handles database-related operations. It takes a User object and saves it to the database (simulated here with a print statement). This class has one responsibility: saving user data.

### EmailService.java

Explanation: The EmailService class is responsible for email communication. It knows how to send a welcome email to a user. This class has one responsibility: sending emails.

### Main.java

Explanation: The Main class is where everything comes together. We create a User, use UserRepository to save the user, and then use EmailService to send a welcome email. Each class does only one job, adhering to the Single Responsibility Principle.

### Conclusion:

In this example, each class has a single responsibility:

1. User only holds user data.
2. UserRepository only handles saving the user to the database.
3. EmailService only sends the welcome email.