package creational.factorymethod.creators;

import creational.factorymethod.types.Notification;
import creational.factorymethod.types.PushNotification;

public class PushNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }

}
