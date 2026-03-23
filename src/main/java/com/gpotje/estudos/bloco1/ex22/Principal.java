package com.gpotje.estudos.bloco1.ex22;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Notification ne = new Email();
        Notification np = new Push();
        Notification ns = new Sms();

        List<Notification> notificationList = new ArrayList<>();
        notificationList.add(ne);
        notificationList.add(np);
        notificationList.add(ns);

        NotificationDispatcher message = new NotificationDispatcher(notificationList,"gpotje.potje@gmail.com");
        message.send();

    }
}
