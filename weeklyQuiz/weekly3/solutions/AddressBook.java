package weekly3.solutions;

import java.util.*;

public class AddressBook {
    public static List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    public void addContancts(Contact contact){
        contacts.add(contact);
    }

    public void displayContact() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
            return;
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchContact(String name) {
        boolean isSearch = false;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
                isSearch = true;
            }
        }
        if (!isSearch) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
