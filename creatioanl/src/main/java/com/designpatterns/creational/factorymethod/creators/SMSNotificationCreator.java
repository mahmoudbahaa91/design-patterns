package com.designpatterns.creational.factorymethod.creators;

import com.designpatterns.creational.factorymethod.types.Notification;
import com.designpatterns.creational.factorymethod.types.SMSNotification;

public class SMSNotificationCreator extends  NotificationCreator {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

}
