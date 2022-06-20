package africa.semicolon.trueCaller.service;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.repositories.ContactRepository;
import africa.semicolon.trueCaller.data.repositories.ContactRepositoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServicesImplTest {
    private ContactService contactService;
    private ContactRepository contactRepository;
    @BeforeEach public void setUp(){
        contactRepository = new ContactRepositoryImpl();
        contactService = new ContactServicesImpl(contactRepository);

    }
    @Test
    public void saveContact_findContactRe(){
        contactService.addContact("tobi", "bool", "1234", true );
        Contact contact = contactService.findById(1);
        assertEquals("tobi", contact.getFirstName());
        assertEquals("bool", contact.getLastName());
        assertEquals("1234", contact.getPhoneNumber());
    }

}