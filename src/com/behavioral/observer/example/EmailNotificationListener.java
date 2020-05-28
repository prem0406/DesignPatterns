package com.behavioral.observer.example;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, String description) {
        System.out.println("Email to " + email + ": " +eventType +" : "+ description);
    }
}