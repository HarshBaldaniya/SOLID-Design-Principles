package services;

import models.User;

// Sends SMS notifications
public class SMSNotificationService implements NotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending welcome SMS to " + user.getPhoneNumber());
    }
}
