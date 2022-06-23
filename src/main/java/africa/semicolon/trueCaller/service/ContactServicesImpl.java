package africa.semicolon.trueCaller.service;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.data.repositories.ContactRepository;

public class ContactServicesImpl  implements ContactService {
    private ContactRepository contactRepository;
//    ContactRepository contactRepository
    public ContactServicesImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


//    @Override
//    public void addContact(String firstName, String lastName, String phoneNumber) {
//        Contact contact = new Contact(firstName, lastName, phoneNumber);
//        contactRepository.save(contact);
//    }

    @Override
    public Contact findById(int i){
        return contactRepository.findById(i);
    }
    

    @Override
    public Contact findByFirstName(String firstName) {
        return contactRepository.findByFirstName(firstName);
    }

    @Override
    public Contact findByLastName(String lastName) {
        return contactRepository.findByLastName(lastName);
    }

    @Override
    public Contact findByPhoneNumber(String phoneNumber) {
        return contactRepository.findByPhoneNumber(phoneNumber);
    }

    @Override
    public Contact update(Contact contact) {
        return contactRepository.update(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        contactRepository.deleteContact(contact);

    }

    @Override
    public int count() {
        return contactRepository.count();
    }


}
