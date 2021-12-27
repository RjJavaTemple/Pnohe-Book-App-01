package In.Ranjan.Rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import In.Ranjan.Binding.ContactForm;
import In.Ranjan.Entity.Contact;
import In.Ranjan.Service.IContactService;

@RestController
public class ContactController {

	// Has-A Relancation In The Service Class
	@Autowired
	private IContactService service;

	// Save The Data
	@PostMapping("savedata")
	public String SaveData(@RequestBody ContactForm from) {

		return service.SaveContact(from);
	}

	// Get The Data
	@GetMapping("getdata")
	public List<ContactForm> GetData() {
		System.out.println("Execute");
		List<ContactForm> GetCon = service.GetContact();
		return GetCon;
	}

	// Edit The Data
	@GetMapping("getdata/{contactid}")
	public ContactForm EditContact(@PathVariable Integer contactid) {
		System.out.println(contactid);
		return service.EditContact(contactid);
	}

	// Delete Contact Data
	@DeleteMapping("deletedata/{contactid}")
	public List<ContactForm> DeleteContact(@PathVariable Integer contactid) {
		return service.DeleteContact(contactid);
	}
}
