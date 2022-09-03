package com.designpatterns.structural.factorymethod;

import com.designpatterns.structural.factorymethod.creators.EmailNotificationCreator;
import com.designpatterns.structural.factorymethod.creators.NotificationCreator;
import com.designpatterns.structural.factorymethod.creators.PushNotificationCreator;
import com.designpatterns.structural.factorymethod.types.Notification;
import com.designpatterns.structural.factorymethod.creators.SMSNotificationCreator;

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
