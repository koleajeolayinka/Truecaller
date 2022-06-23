package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactRepositoryImplTest {
    private ContactRepository contactRepository;
    private Contact contact;
    private Contact contact2;

    @BeforeEach
    public void startWithThis() {
        contactRepository = new ContactRepositoryImpl();
        contact = new Contact();
        contact2 = new Contact();
    }

    @Test
    public void saveContact_countIsOneTest() {
        contact.setFirstName("tobi");
        contact2.setFirstName("tk");
        Contact savedContact = contactRepository.save(contact);
        Contact savedContact2 = contactRepository.save(contact2);
        assertEquals(0, savedContact.getId());
        assertEquals(0, savedContact2.getId());
        assertEquals(2, contactRepository.count());

    }

    @Test
    public void saveContact_findByIdReturnContact() {
        Contact contact = new Contact("tobi", "ton", "333");
        contact.setFirstName("tobi");
        contact.setLastName("ton");
        contact2.setFirstName("tk");
        contact2.setLastName("rite");

        Contact savedContact = contactRepository.save(contact);
        Contact savedContact2 = contactRepository.save(contact2);

        Contact foundContact = contactRepository.findById(1);
        Contact secondContact = contactRepository.findById(2);

        assertEquals(0, foundContact.getId());
        assertEquals(0, secondContact.getId());
        assertEquals("tobi", foundContact.getFirstName());
        assertEquals("tk", secondContact.getFirstName());
    }
    @Test
    public void TestContactCanDelete(){
        Contact contact = new Contact("tobi", "ton", "546");
        contactRepository.deleteContact(contact);
        Contact foundContact = contactRepository.findById(0);
        assertEquals(0, foundContact.getId());
//        assertEquals("tobi", );


    }
    @Test
    public void TestContactCanUpdate(){
        Contact contact = new Contact("tobi", "ton", "546");
        contactRepository.update(contact);
    }


    }
