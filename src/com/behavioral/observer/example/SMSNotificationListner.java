package com.behavioral.observer.example;

public class SMSNotificationListner implements EventListener {
	private String contactno;
	
	public SMSNotificationListner(String contactno) {
		this.contactno = contactno;
	}

	@Override
	public void update(String eventType, String description) {
		 System.out.println("SMS to :" + this.contactno + ": "+  eventType +" : " + description);
	}

}
