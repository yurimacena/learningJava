package Map;

import java.util.HashMap;
import java.util.Map;

public class ScheduleContacts {
    private final Map<String, Integer> scheduleContactMap;

    public ScheduleContacts() {
        this.scheduleContactMap = new HashMap<>();
    }
    
    public void addContact(String name, Integer telephone) {
        scheduleContactMap.put(name, telephone); //insert and replace-update
    }

    public void removeContact(String name) {
        if(scheduleContactMap.isEmpty()) {
            scheduleContactMap.remove(name);
        }
    }

    public void showContacts() {
        System.out.println(scheduleContactMap);
    }

    public Integer searchPerName(String name) {
        Integer numberPerName = null;
        if(!scheduleContactMap.isEmpty()) {
            numberPerName = scheduleContactMap.get(name);
        }
        return numberPerName;
    }

    public static void main(String[] args) {
        ScheduleContacts scheduleContacts = new ScheduleContacts();

        scheduleContacts.addContact("Vermont", 1234);
        scheduleContacts.addContact("Vermont", 5678);
        scheduleContacts.addContact("Alexander", 5678);
        scheduleContacts.addContact("Armand", 9123);
        scheduleContacts.addContact("Simonne", 4567);
        scheduleContacts.addContact("Marie", 8901);
        scheduleContacts.addContact("Vermont", 5555);
        
        scheduleContacts.showContacts();

        scheduleContacts.removeContact("Marie");
        scheduleContacts.showContacts();

        System.out.println("The number is " + scheduleContacts.searchPerName("Vermont"));
    }
}
