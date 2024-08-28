package List.src.Set;

import java.util.HashSet;
import java.util.Set;

public class GuestsSets {
    private final Set<Guest> guestSet;

    public GuestsSets() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int invitationCode) {
        guestSet.add(new Guest(name, invitationCode));
    }

    public void removeGuest(int invitationCode) {
        Guest guestToRemove = null;
        for(Guest c : guestSet) {
            if (c.getInvitationCode() == invitationCode) {
                guestToRemove = c;
                break;
            }
        }
        guestSet.remove(guestToRemove);
    }

    public int countGuests() {
        return guestSet.size();
    }

    public void showGuests() {
        System.out.println(guestSet);
    }

    public static void main(String[] args) {
        GuestsSets guestsSets = new GuestsSets();
        System.out.println("Exists " + guestsSets.countGuests() + " guest(s) in the set of Guests.");

        guestsSets.addGuest("Guest 1", 1234);
        guestsSets.addGuest("Guest 2", 5678);
        guestsSets.addGuest("Guest 3", 9012);
        guestsSets.addGuest("Guest 4", 9012);

        System.out.println("Exists " + guestsSets.countGuests() + " guest(s) in the set of Guests.");

        guestsSets.removeGuest(1234);
        System.out.println("Exists " + guestsSets.countGuests() + " guest(s) in the set of Guests.");
        guestsSets.showGuests();
    }
}
