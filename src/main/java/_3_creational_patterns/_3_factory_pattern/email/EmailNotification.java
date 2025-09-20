package _3_creational_patterns._3_factory_pattern.email;

import _3_creational_patterns._3_factory_pattern.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an Email notification");
    }
}

