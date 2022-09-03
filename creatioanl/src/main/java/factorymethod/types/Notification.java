package factorymethod.types;

public abstract class Notification {

    public abstract void sendNotification();

    public void encryptNotificationContent() {
        System.out.println("Encrypting notification content");
    }

}
