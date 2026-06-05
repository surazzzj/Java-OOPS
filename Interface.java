interface Notification {

    void send();
}

class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Email Notification Sent.");
    }
}

class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS Notification Sent.");
    }
}

class PushNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Push Notification Sent.");
    }
}

public class Interface {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new PushNotification();

        n1.send();
        n2.send();
        n3.send();
    }
}