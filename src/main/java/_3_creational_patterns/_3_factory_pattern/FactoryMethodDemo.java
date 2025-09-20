package _3_creational_patterns._3_factory_pattern;

import _3_creational_patterns._3_factory_pattern.email.EmailNotificationFactory;
import _3_creational_patterns._3_factory_pattern.push.PushNotificationFactory;
import _3_creational_patterns._3_factory_pattern.sms.SMSNotificationFactory;

public class FactoryMethodDemo {
    public static void main(String[] args) {

        NotificationFactory factory;

        factory = new EmailNotificationFactory();
        factory.sendNotification();  // Sending an Email notification

        factory = new SMSNotificationFactory();
        factory.sendNotification();  // Sending an SMS notification

        factory = new PushNotificationFactory();
        factory.sendNotification();  // Sending a Push notification
    }
}
