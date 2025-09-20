package _3_creational_patterns._3_factory_pattern.push;

import _3_creational_patterns._3_factory_pattern.Notification;
import _3_creational_patterns._3_factory_pattern.NotificationFactory;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
