package creational.factorymethod.types;

public class EmailNotification extends Notification {

    @Override
    public void sendNotification() {
        System.out.println("Sending Email...");
    }

}
