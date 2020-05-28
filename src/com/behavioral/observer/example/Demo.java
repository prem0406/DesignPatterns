package com.behavioral.observer.example;
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("Event", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("Event", new PortalNotificationListner("EMP01"));
        
        
        editor.events.subscribe("Urgent Help", new SMSNotificationListner("1234567890"));
        editor.events.subscribe("Urgent Help", new EmailNotificationListener("employee@gmail.com"));
        
        editor.events.subscribe("Holiday", new PortalNotificationListner("EMP01"));
        
        editor.events.subscribe("Nagarro News", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("Nagarro News", new PortalNotificationListner("EMP01"));
        
        editor.events.subscribe("New Policy", new EmailNotificationListener("admin@example.com"));
        editor.events.subscribe("New Policy", new PortalNotificationListner("EMP01"));
        
        

//        editor.eventNotification("A new Event is going to be organised on 31-May-2020");
//        editor.urgentHelpNotification("B+ blood required please call at 0000000000");
//        editor.holidayNotification("Tommorow is holiday");
        editor.nagarroNewsNotification("Office is close due to covid19 pandemic");
//        editor.newPolicyNotification("New Policy is issued");
    }
}