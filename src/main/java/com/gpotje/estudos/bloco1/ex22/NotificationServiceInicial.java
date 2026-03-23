package com.gpotje.estudos.bloco1.ex22;

public class NotificationServiceInicial {
    public void send(NotificationInicial notification) {

        if (notification.getType().equals("EMAIL")) {
            System.out.println("Sending email to " + notification.getRecipient());
        }

        if (notification.getType().equals("SMS")) {
            System.out.println("Sending SMS to " + notification.getRecipient());
        }

        if (notification.getType().equals("PUSH")) {
            System.out.println("Sending push notification to " + notification.getRecipient());
        }
    }
    class NotificationInicial {

        private String type;
        private String recipient;

        public NotificationInicial(String type, String recipient) {
            this.type = type;
            this.recipient = recipient;
        }

        public String getType() {
            return type;
        }

        public String getRecipient() {
            return recipient;
        }
    }
}
