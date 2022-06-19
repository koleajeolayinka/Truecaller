package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {
    private ContactRepository contactRepository;

    @BeforeEach
    public void startWithThis() {
        contactRepository = new ContactRepositoryImpl();
    }

    @Test
    public void saveContact_countIsOneTest() {
        Contact contact = new Contact("tobi", "ton", "333");
        contact.setFirstName("tobi");
        Contact contact2 = new Contact("tk", "rite", "111");
        contact2.setFirstName("tk");
        Contact savedContact = contactRepository.save(contact);
        Contact savedContact2 = contactRepository.save(contact2);
        assertEquals(1, savedContact.getId());
        assertEquals(2, savedContact2.getId());
        assertEquals(2, contactRepository.count());

    }

    @Test
    public void saveContact_findByIdReturnContact() {
        Contact contact = new Contact("tobi", "ton", "333");
        Contact contact2 = new Contact("tk", "rite", "111");
        contact.setFirstName("tobi");
        contact.setLastName("ton");
        contact2.setFirstName("tk");
        contact2.setLastName("rite");

        Contact savedContact = contactRepository.save(contact);
        Contact savedContact2 = contactRepository.save(contact2);

        Contact foundContact = contactRepository.findById(1);
        Contact secondContact = contactRepository.findById(2);

        assertEquals(1, foundContact.getId());
        assertEquals(2, secondContact.getId());
        assertEquals("tobi", foundContact.getFirstName());
        assertEquals("tk", secondContact.getFirstName());
        assertEquals("tk", secondContact.getFirstName());
    }
}