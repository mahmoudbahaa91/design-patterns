package creational.factorymethod;

import creational.factorymethod.creators.EmailNotificationCreator;
import creational.factorymethod.creators.NotificationCreator;
import creational.factorymethod.creators.PushNotificationCreator;
import creational.factorymethod.creators.SMSNotificationCreator;
import creational.factorymethod.types.Notification;

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
