package factorymethod.creators;

import factorymethod.types.Notification;
import factorymethod.types.PushNotification;

public class PushNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }

}
