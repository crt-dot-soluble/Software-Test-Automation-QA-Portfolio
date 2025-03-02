// --- Author: Corderro Artz


package snhu;


//Defines the requirements of a Contact as per the given specification
public class Contact {
	
	
	// --- Class Members
	// ------------------------------------------	// --- Requirements
    private final 	String		contactId;			// Cannot be null or exceed 10 characters
    private 		String		firstName;			// Cannot be null or exceed 10 characters
    private 		String		lastName;			// Cannot be null or exceed 10 characters
    private 		String		phone;				// Cannot be null and must be exactly 10 digits
    private 		String		address;			// Cannot be null or exceed 30 characters
    
    
	// --- Constructor
	// ------------------------------------------
    // Constructs a contact object and initializes its field values to the supplied values.
    public Contact(String contactId, String firstName, String lastName, String phone, String address) {
        
    	// Validate contactId
        if (contactId == null
        || contactId.length() > 10) {
            throw new IllegalArgumentException("Contact ID is required and cannot exceed 10 characters");
        }
        
        // Set class members equal to the corresponding parameters 
        this.contactId = contactId;
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setAddress(address);
    }

    
	// --- Getters
	// ------------------------------------------
    public String getContactId() 	{ return contactId; }
    public String getFirstName()	{ return firstName; }
    public String getLastName()		{ return lastName; }
    public String getPhone() 		{ return phone; }
    public String getAddress() 		{ return address; }

    
	// --- Setters
	// ------------------------------------------
    // Verifies firstname meets the requirements
    public void setFirstName(String firstName) {
        if (firstName == null
        || firstName.length() > 10) {
            throw new IllegalArgumentException("First name is required and cannot exceed 10 characters");
        }
        
        this.firstName = firstName;
    }
    
    // Verifies lastname meets the requirements
    public void setLastName(String lastName) {
        if (lastName == null
        || lastName.length() > 10) {
            throw new IllegalArgumentException("Last name is required and cannot exceed 10 characters");
        }
        
        this.lastName = lastName;
    }
    
    // Verifies phone meets the requirements
    public void setPhone(String phone) {
        if (phone == null
        || phone.length() != 10
        || !phone.matches("\\d+")) {		// use regex to determine whether or not the content consists of only digits
            throw new IllegalArgumentException("Phone number must be exactly 10 digits");
        }
        
        this.phone = phone;
    }
    
    // Verifies address meets the requirements
    public void setAddress(String address) {
        if (address == null
        || address.length() > 30) {
            throw new IllegalArgumentException("Address is required and cannot exceed 30 characters");
        }
        
        this.address = address;
    }
}