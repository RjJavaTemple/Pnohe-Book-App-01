package In.Ranjan.Service;

import java.util.List;

import In.Ranjan.Binding.ContactForm;

public interface IContactService {

	// Save The Contact Data
	public String SaveContact(ContactForm contact);

	// Get The Contact Data
	public List<ContactForm> GetContact();

	// Update The Contact
	public ContactForm EditContact(Integer contactid);

	// Delete Contact
	public List<ContactForm> DeleteContact(Integer ContactId);
}
