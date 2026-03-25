package com.gpotje.estudos.bloco1.ex22;

import java.util.List;

public class NotificationDispatcher {
    private String recipient;
    private List<Notification> notifications;

    public NotificationDispatcher(List<Notification> notifications, String recipient) {
        this.notifications = notifications;
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void send(){
        for(Notification n : notifications){
            n.send(recipient);
        }
    }
}
