package PhoneBook;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<PhoneContact, String> phoneBook = new HashMap<>();

    public PhoneBook() {
    }

    public Map<PhoneContact, String> getPhoneBook() {
        return phoneBook;
    }

    public void addContactToPhoneBook(PhoneContact phoneContact) {
        if (phoneContact.getPhoneNumber().length() == 11 && phoneContact.getPhoneNumber().startsWith("8") && phoneContact.getPhoneNumber().matches("\\d{11}")) {
            getPhoneBook().put(phoneContact, phoneContact.getPhoneNumber());
        }
    }

    public void printPhoneBook() {
        for (PhoneContact contact : phoneBook.keySet()) {
            System.out.println(contact.getFullName() + " " + contact.getPhoneNumber());
        }

    }
}
