package org.tektutor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContactController {

	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping("/contacts")
	public List<Contact> getContacts() {
		return contactRepository.findAll();
	}

	@GetMapping("/contact/{id}")
	public Contact getContact(@PathVariable Long id) {
		return contactRepository.findOne(id);
	}
	
	@DeleteMapping("/contact/{id}")
	public boolean deleteContact(@PathVariable Long id) {
		contactRepository.delete(id);
		return true;
	}
	
	@PostMapping("/contact")
	public boolean createContact(Contact contact) {
		contactRepository.save(contact);
		return true;
	}

	@PutMapping("/contact")
	public boolean updateContact(Contact contact) {
		contactRepository.save(contact);
		return true;
	}

}
