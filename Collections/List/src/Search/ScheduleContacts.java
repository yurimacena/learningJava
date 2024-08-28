package List.src.Search;

import java.util.HashSet;
import java.util.Set;

public class ScheduleContacts {
    private final Set<Contact> contactSet;

    public ScheduleContacts() {
        this.contactSet = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contactSet.add(new Contact(name, number));
    }

    public void showContacts() {
        System.out.println(contactSet);
    }

    public Set<Contact> searchPerName(String name) {
        Set<Contact> contactsPerName = new HashSet<>();
        for(Contact c : contactSet) {
            if(c.getName().startsWith(name)) {
                contactsPerName.add(c);
            }
        }
        return contactsPerName;
    }
    
    public Contact updateNumberContact(String name, int newNumber) {
        Contact updatedContact = null;
        for(Contact c : contactSet) {
            if(c.getName().equalsIgnoreCase(name)) {
                c.setNumber(newNumber);
                updatedContact = c;
                break;
            }
        }
        return updatedContact;
    }

    public static void main(String[] args) {
        ScheduleContacts scheduleContacts = new ScheduleContacts();

        scheduleContacts.showContacts();

        scheduleContacts.addContact("Albert", 1234);
        scheduleContacts.addContact("DePierre", 5678);
        scheduleContacts.addContact("DePierre", 5555);
        scheduleContacts.addContact("Louverture", 9012);
        scheduleContacts.addContact("Armand", 3456);
    
        scheduleContacts.showContacts();

        System.out.println(scheduleContacts.searchPerName("Albert"));
    
        System.out.println("Updated contact: " + scheduleContacts.updateNumberContact("Albert", 1414));
        
        scheduleContacts.showContacts();
    }   
}
