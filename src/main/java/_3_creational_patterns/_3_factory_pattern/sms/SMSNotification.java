package _3_creational_patterns._3_factory_pattern.sms;

import _3_creational_patterns._3_factory_pattern.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification");
    }
}
