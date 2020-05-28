package com.behavioral.observer.example;

public class Editor {
    public EventManager events;
//    private String description;

    public Editor() {
        this.events = new EventManager("Event", "Urgent Help", "Holiday", "Nagarro News", "New Policy");
    }

//    public void openFile(String filePath) {
//        this.file = new File(filePath);
//        events.notify("open", file);
//    }

//    public void saveFile() throws Exception {
//        if (this.file != null) {
//            events.notify("save", file);
//        } else {
//            throw new Exception("Please open a file first.");
//        }
//    }
    
    
    public void eventNotification(String description) {
    	events.notify("Event",description);
    }
    
    public void urgentHelpNotification(String description) {
    	events.notify("Urgent Help", description);
    }
    
    public void holidayNotification(String description) {
    	events.notify("Holiday", description);
    }
    
    public void nagarroNewsNotification(String description) {
    	events.notify("Nagarro News", description);
    }
    
    public void newPolicyNotification(String description) {
    	events.notify("New Policy", description);
    }
}