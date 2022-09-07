package com.designpatterns.creational.factorymethod.creators;

import com.designpatterns.creational.factorymethod.types.PushNotification;
import com.designpatterns.creational.factorymethod.types.Notification;

public class PushNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }

}
