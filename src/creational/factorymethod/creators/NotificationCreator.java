package creational.factorymethod.creators;

import creational.factorymethod.types.Notification;

public abstract class NotificationCreator {

    public Notification getNotification(){
        Notification notification = createNotification();
        notification.encryptNotificationContent();
        return notification;
    }

    // Factory Method.
    public abstract Notification createNotification();

}
