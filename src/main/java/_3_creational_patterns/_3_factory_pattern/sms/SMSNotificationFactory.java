package _3_creational_patterns._3_factory_pattern.sms;

import _3_creational_patterns._3_factory_pattern.Notification;
import _3_creational_patterns._3_factory_pattern.NotificationFactory;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
