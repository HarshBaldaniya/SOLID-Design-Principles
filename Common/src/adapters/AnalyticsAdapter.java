package adapters;

import models.User;

// Common interface for analytics integrations
public interface AnalyticsAdapter {
    void notifyUserRegistration(User user);
    boolean shouldRun(User user); // Determines if the adapter should run dynamically
    boolean isEnabled(); // Determines if the adapter is enabled globally
}
