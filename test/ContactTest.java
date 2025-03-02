package snhu.test;

import org.junit.Test;
import static org.junit.Assert.*;
import snhu.*;


public class ContactTest {
    
    @Test
    public void testValidContact() {
        Contact contact = new Contact("ID123", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("ID123", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidContactIdLength() {
        new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullContactId() {
        new Contact(null, "John", "Doe", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidFirstNameLength() {
        new Contact("ID123", "JohnJacobJingleheimer", "Doe", "1234567890", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidPhoneNumber() {
        new Contact("ID123", "John", "Doe", "123", "123 Main St");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNonDigitPhoneNumber() {
        new Contact("ID123", "John", "Doe", "123abc4567", "123 Main St");
    }
}