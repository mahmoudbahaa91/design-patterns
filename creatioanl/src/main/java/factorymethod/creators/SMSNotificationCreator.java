package factorymethod.creators;

import factorymethod.types.Notification;
import factorymethod.types.SMSNotification;

public class SMSNotificationCreator extends  NotificationCreator {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

}
