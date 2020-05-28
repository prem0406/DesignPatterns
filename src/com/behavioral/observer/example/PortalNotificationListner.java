package com.behavioral.observer.example;

public class PortalNotificationListner implements EventListener {
    private String portalId;

    public PortalNotificationListner(String portalId) {
        this.portalId = portalId;
    }

    @Override
    public void update(String eventType, String description) {
        System.out.println("Push Notification to Portal Id:" + this.portalId + ": "+  eventType +" : " + description);
    }
}