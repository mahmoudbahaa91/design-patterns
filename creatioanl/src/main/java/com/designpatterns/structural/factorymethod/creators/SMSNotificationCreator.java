package com.designpatterns.structural.factorymethod.creators;

import com.designpatterns.structural.factorymethod.types.Notification;
import com.designpatterns.structural.factorymethod.types.SMSNotification;

public class SMSNotificationCreator extends  NotificationCreator {

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }

}
