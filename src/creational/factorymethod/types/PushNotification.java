package creational.factorymethod.types;

public class PushNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending Push Notification...");
    }

}
