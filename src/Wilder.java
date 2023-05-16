public class Wilder {
    String firstName;
    boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean getAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI(String firstname, boolean aware) {
        String value;
        if (firstname != null && aware) {
            value = "Je m'appelle " + firstname + " et je suis aware";
        } else {
            value = "Je m'appelle " + firstname + " et je ne suis pas aware";
        }
        return value;
    }
}
