package services;

import adapters.AnalyticsManager;
import models.User;
import repository.UserRepository;

// Orchestrates the registration process with notifications
public class UserRegistrationService {
    private final UserRepository userRepository;
    private final LoggerService loggerService;
    private final UserValidator userValidator;
    private final NotificationManager notificationManager;
    private final AnalyticsManager analyticsManager;

    public UserRegistrationService(UserRepository userRepository,
                                   LoggerService loggerService,
                                   UserValidator userValidator,
                                   NotificationManager notificationManager,
                                   AnalyticsManager analyticsManager) {
        this.userRepository = userRepository;
        this.loggerService = loggerService;
        this.userValidator = userValidator;
        this.notificationManager = notificationManager;
        this.analyticsManager = analyticsManager;
    }

    public void registerUser(User user) {
        userValidator.validate(user); // Validate user details
        userRepository.save(user); // Save user to the database
        notificationManager.sendNotifications(user); // Send notifications dynamically
        analyticsManager.notifyAllAdapters(user); // Notify analytics service
        loggerService.log("User " + user.getName() + " registered successfully."); // Log registration
    }
}
