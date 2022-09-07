package com.designpatterns.creational.factorymethod.creators;

import com.designpatterns.creational.factorymethod.types.EmailNotification;
import com.designpatterns.creational.factorymethod.types.Notification;

public class EmailNotificationCreator extends  NotificationCreator {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }

}
