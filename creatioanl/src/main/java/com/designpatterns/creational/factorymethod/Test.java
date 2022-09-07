package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.factorymethod.creators.EmailNotificationCreator;
import com.designpatterns.creational.factorymethod.creators.NotificationCreator;
import com.designpatterns.creational.factorymethod.creators.PushNotificationCreator;
import com.designpatterns.creational.factorymethod.types.Notification;
import com.designpatterns.creational.factorymethod.creators.SMSNotificationCreator;

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
