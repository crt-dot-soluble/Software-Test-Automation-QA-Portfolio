// --- Author: Corderro Artz


package snhu;


import java.util.HashMap;
import java.util.Map;


// Provides functions to manipulate a collection of contacts
public class ContactService {
	
	// Stores contacts as a KVP where the id is the key and the contact is the value
    private Map<String, Contact> contacts = new HashMap<>();
    
    // Adds a contact to the map
    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }
        
        // contact already exists
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }
        
        contacts.put(contact.getContactId(), contact);
    }
    
    // Deletes a contact via id
    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        contacts.remove(contactId);
    }
    
    // Updates a contact with the given information
    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contact = contacts.get(contactId);
        if (contact == null) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }

        if (firstName != null) {
            contact.setFirstName(firstName);
        }
        if (lastName != null) {
            contact.setLastName(lastName);
        }
        if (phone != null) {
            contact.setPhone(phone);
        }
        if (address != null) {
            contact.setAddress(address);
        }
    }
    
    // Gets a contact via id
    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}