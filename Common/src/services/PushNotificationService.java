package services;

import models.User;

// Sends push notifications
public class PushNotificationService implements NotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending push notification to user " + user.getName());
    }
}
