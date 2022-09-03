package com.designpatterns.structural.factorymethod.creators;

import com.designpatterns.structural.factorymethod.types.EmailNotification;
import com.designpatterns.structural.factorymethod.types.Notification;

public class EmailNotificationCreator extends  NotificationCreator {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

}
