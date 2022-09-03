package com.designpatterns.structural.factorymethod.creators;

import com.designpatterns.structural.factorymethod.types.PushNotification;
import com.designpatterns.structural.factorymethod.types.Notification;

public class PushNotificationCreator extends NotificationCreator {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }

}
