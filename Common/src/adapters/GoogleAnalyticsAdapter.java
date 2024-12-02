package adapters;

import models.User;

// Adapter for Google Analytics
public class GoogleAnalyticsAdapter implements AnalyticsAdapter {
    private boolean enabled = true; // Default is enabled

    @Override
    public void notifyUserRegistration(User user) {
        System.out.println("Notifying Google Analytics about user registration: " + user.getEmail());
    }

    @Override
    public boolean shouldRun(User user) {
        return user.getEmail().endsWith("@gmail.com"); // Run only for Gmail users
    }

    @Override
    public boolean isEnabled() {
        return enabled; // Adapter is active only if enabled is true
    }

    // Allows toggling the enabled state
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
