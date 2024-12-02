package adapters;

import models.User;

// Adapter for Adobe Analytics
public class AdobeAnalyticsAdapter implements AnalyticsAdapter {
    private boolean enabled = true; // Default is enabled

    @Override
    public void notifyUserRegistration(User user) {
        System.out.println("Notifying Adobe Analytics about user registration: " + user.getEmail());
    }

    @Override
    public boolean shouldRun(User user) {
        return user.getName().startsWith("H"); // Run only for users whose name starts with 'H'
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
