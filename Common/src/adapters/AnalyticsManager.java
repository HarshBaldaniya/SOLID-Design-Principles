package adapters;

import models.User;
import java.util.List;

// Manages multiple analytics adapters
public class AnalyticsManager {
    private final List<AnalyticsAdapter> analyticsAdapters;

    public AnalyticsManager(List<AnalyticsAdapter> analyticsAdapters) {
        this.analyticsAdapters = analyticsAdapters;
    }

    public void notifyAllAdapters(User user) {
        for (AnalyticsAdapter adapter : analyticsAdapters) {
            if (adapter.isEnabled()) { // Check if the adapter is enabled
                if (adapter.shouldRun(user)) { // Check if the adapter should run
                    adapter.notifyUserRegistration(user);
                } else {
                    System.out.println("Skipping " + adapter.getClass().getSimpleName() + " for user: " + user.getEmail());
                }
            } else {
                System.out.println(adapter.getClass().getSimpleName() + " is disabled and will not run.");
            }
        }
    }
}
