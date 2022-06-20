package africa.semicolon.trueCaller.service;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.repositories.ContactRepository;
import lombok.NonNull;

public class ContactServicesImpl  implements ContactService {
    private ContactRepository contactRepository;
    public ContactServicesImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
    @Override
    public void addContact(String firstName, String lastName, String phoneNumber, boolean DeleteId){
        
        Contact contact = new Contact(firstName, lastName, phoneNumber, DeleteId);
        contactRepository.save(contact);
    }
    @Override
    public Contact findById(int i){
        return contactRepository.findById(i);
    }


}
