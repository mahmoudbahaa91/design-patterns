package factorymethod.creators;

import factorymethod.types.EmailNotification;
import factorymethod.types.Notification;

public class EmailNotificationCreator extends  NotificationCreator {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

}
