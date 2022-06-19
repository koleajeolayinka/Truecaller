package africa.semicolon.trueCaller.service;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.repositories.ContactRepository;

public class ContactServicesImpl  implements ContactService {
    private ContactRepository contactRepository;
    public ContactServicesImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @Override
    public void addContact(String firstName, String lastName, String phoneNumber){
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contactRepository.save(contact);
    }
    @Override
    public Contact findById(int i){
        return contactRepository.findById(i);
    }


}
