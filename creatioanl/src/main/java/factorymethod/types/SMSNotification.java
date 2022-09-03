package factorymethod.types;

public class SMSNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending SMS...");
    }

}
