package In.Ranjan.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import In.Ranjan.Binding.ContactForm;
import In.Ranjan.Entity.Contact;
import In.Ranjan.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements IContactService {

	// Add The Class The Repository Has-A Property
	@Autowired
	private ContactRepository ConRepo;

	public String SaveContact(ContactForm contact) {
		Contact con = new Contact();
		BeanUtils.copyProperties(contact, con);
		con.setContactActiveSwitch("Y");
		ConRepo.save(con);
		if (con.getContactId() != null) {
			return "SUCESS..................!!";
		}
		return "Plz Enter Write Thing  FAIELD...........!!";
	}

	public List<ContactForm> GetContact() {
		// Add The Data In The Db To Binding Data
		List<ContactForm> contactfrom = new ArrayList<ContactForm>();
		List<Contact> GetContact = ConRepo.findAll();
		for (Contact cont : GetContact) {
			ContactForm conFrom = new ContactForm();
			BeanUtils.copyProperties(cont, conFrom);
			contactfrom.add(conFrom);
		}
		return contactfrom;
	}

	public ContactForm EditContact(Integer contactid) {
		Optional<Contact> ConEnt = ConRepo.findById(contactid);
		if (ConEnt.isPresent()) {
			Contact conta = ConEnt.get();
			ContactForm confrom = new ContactForm();
			BeanUtils.copyProperties(conta, confrom);
			return confrom;
		}
		return null;
	}

	public List<ContactForm> DeleteContact(Integer ContactId) {
		// Hard Delete
		ConRepo.deleteById(ContactId);
		List<ContactForm> contactfrom = new ArrayList<ContactForm>();
		List<Contact> GetContact = ConRepo.findAll();
		for (Contact cont : GetContact) {
			ContactForm conFrom = new ContactForm();
			BeanUtils.copyProperties(cont, conFrom);
			contactfrom.add(conFrom);
		}
		return contactfrom;
	}

}
