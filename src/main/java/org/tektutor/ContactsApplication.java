package org.tektutor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactsApplication implements CommandLineRunner {

	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		contactRepository.save(new Contact("Jeganathan","Swaminathan", "1234567890") );
		contactRepository.save(new Contact("Nitesh","Jeganathan", "43423423432") );
		contactRepository.save(new Contact("Sriram","Jeganathan", "3423434423") );
		contactRepository.save(new Contact("Jeganathan","Swaminathan", "1234567890") );
	}
}
