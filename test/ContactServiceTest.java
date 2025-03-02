// --- Author: Corderro Artz


package snhu.test;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import snhu.*;


public class ContactServiceTest {
	
    // Initial objects
    private ContactService contactService;
    private Contact testContact;

    @Before // Called before testing
    public void setUp() {
    	// Initialize required objects
        contactService = new ContactService();
        testContact = new Contact("ID123", "John", "Doe", "1234567890", "123 Main St");
    }

    @Test
    public void testAddContact() {
        contactService.addContact(testContact);
        assertEquals(testContact, contactService.getContact("ID123"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddDuplicateContact() {
        contactService.addContact(testContact);
        contactService.addContact(testContact);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddNullContact() {
        contactService.addContact(null);
    }

    @Test
    public void testDeleteContact() {
        contactService.addContact(testContact);
        contactService.deleteContact("ID123");
        assertNull(contactService.getContact("ID123"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDeleteNonexistentContact() {
        contactService.deleteContact("ID999");
    }

    @Test
    public void testUpdateContact() {
        contactService.addContact(testContact);
        contactService.updateContact("ID123", "Jane", "Smith", "9876543210", "456 Oak St");
        
        Contact updatedContact = contactService.getContact("ID123");
        assertEquals("Jane", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("9876543210", updatedContact.getPhone());
        assertEquals("456 Oak St", updatedContact.getAddress());
    }

    @Test // Test partial update (only firstName)
    public void testPartialUpdateFirstName() {
        contactService.addContact(testContact);
        contactService.updateContact("ID123", "Jane", null, null, null);
        assertEquals("Jane", contactService.getContact("ID123").getFirstName());
        assertEquals("Doe", contactService.getContact("ID123").getLastName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUpdateNonexistentContact() {
        contactService.updateContact("ID999", "Jane", "Smith", "9876543210", "456 Oak St");
    }
}