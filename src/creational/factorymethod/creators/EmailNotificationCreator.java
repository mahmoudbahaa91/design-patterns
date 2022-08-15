package creational.factorymethod.creators;

import creational.factorymethod.types.EmailNotification;
import creational.factorymethod.types.Notification;

public class EmailNotificationCreator extends  NotificationCreator {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

}
