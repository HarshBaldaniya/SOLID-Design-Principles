package services;

import models.User;

// Sends email notifications
public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending welcome email to " + user.getEmail());
    }
}
