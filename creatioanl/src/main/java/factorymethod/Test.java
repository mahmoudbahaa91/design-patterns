package factorymethod;

import factorymethod.creators.EmailNotificationCreator;
import factorymethod.creators.NotificationCreator;
import factorymethod.creators.PushNotificationCreator;
import factorymethod.creators.SMSNotificationCreator;
import factorymethod.types.Notification;

public class Test {

    public static void main(String[] args) {

        sendNotification(new EmailNotificationCreator());
        sendNotification(new SMSNotificationCreator());
        sendNotification(new PushNotificationCreator());

    }

    public static void sendNotification(NotificationCreator creator){
       Notification notification = creator.getNotification();
       notification.sendNotification();
    }

}
