package _3_creational_patterns._3_factory_pattern.email;

import _3_creational_patterns._3_factory_pattern.Notification;
import _3_creational_patterns._3_factory_pattern.NotificationFactory;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

