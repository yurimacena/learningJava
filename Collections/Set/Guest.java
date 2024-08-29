package Set;

public class Guest {
    private final String name;
    private final int invitationCode;
    
    public Guest(String name, int invitationCode) {
        this.name = name;
        this.invitationCode = invitationCode;
    }

    public String getName() {
        return name;
    }

    public int getInvitationCode() {
        return invitationCode;
    }
    
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + invitationCode;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Guest other = (Guest) obj;
        return invitationCode == other.invitationCode;
    }

    @Override
    public String toString() {
        return "Guest [name=" + name + ", invitationCode=" + invitationCode + "]";
    }

    
}
