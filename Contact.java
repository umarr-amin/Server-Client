import java.util.ArrayList;

public class Contact {
    private String contactId;
    private String name;

    public Contact(String contactId, String name) {
        this.contactId = contactId;
        this.name = name;
    }

    public String getContactId() {
        return contactId;
    }

    public String getName() {
        return name;
    }

    public void displayContactDetails() {
        System.out.println("Contact ID: " + contactId + ", Name: " + name);
    }
}