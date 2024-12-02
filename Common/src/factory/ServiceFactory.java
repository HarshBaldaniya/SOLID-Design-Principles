package factory;

import adapters.AdobeAnalyticsAdapter;
import adapters.AnalyticsManager;
import adapters.GoogleAnalyticsAdapter;
import repository.UserRepository;
import services.*;

import java.util.Arrays;

public class ServiceFactory {
    public static UserRepository createUserRepository() {
        return new UserRepository();
    }

    public static LoggerService createLoggerService() {
        return new LoggerService();
    }

    public static UserValidator createUserValidator() {
        return new UserValidator();
    }

    public static AnalyticsManager createAnalyticsManager() {
        // Create instances of adapters
        GoogleAnalyticsAdapter googleAdapter = new GoogleAnalyticsAdapter();
        AdobeAnalyticsAdapter adobeAdapter = new AdobeAnalyticsAdapter();

        // Example: Disable Adobe Analytics
        adobeAdapter.setEnabled(false);

        return new AnalyticsManager(
            Arrays.asList(
                googleAdapter,
                adobeAdapter
            )
        );
    }

    public static NotificationManager createNotificationManager() {
        // Add all available notification services
        return new NotificationManager(
                Arrays.asList(
                        new PushNotificationService(),
                        new EmailNotificationService(),
                        new SMSNotificationService()));
    }

    public static UserRegistrationService createUserRegistrationService() {
        return new UserRegistrationService(
                createUserRepository(),
                createLoggerService(),
                createUserValidator(),
                createNotificationManager(),
                createAnalyticsManager());
    }
}
