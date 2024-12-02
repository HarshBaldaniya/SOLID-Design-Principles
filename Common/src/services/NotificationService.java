package services;

import models.User;

// Generic interface for notifications
public interface NotificationService {
    void sendNotification(User user);
}
