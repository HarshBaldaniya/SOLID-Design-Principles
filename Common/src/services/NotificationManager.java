package services;

import models.User;
import java.util.List;

// Manages multiple notification services
public class NotificationManager {
    private final List<NotificationService> notificationServices;

    public NotificationManager(List<NotificationService> notificationServices) {
        this.notificationServices = notificationServices;
    }

    public void sendNotifications(User user) {
        for (NotificationService service : notificationServices) {
            service.sendNotification(user); // Calls each notification service
        }
    }
}
