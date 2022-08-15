package creational.factorymethod.creators;

import creational.factorymethod.types.Notification;
import creational.factorymethod.types.SMSNotification;

public class SMSNotificationCreator extends  NotificationCreator {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

}
