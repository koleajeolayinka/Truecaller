package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.Exception.NoContactException;
import africa.semicolon.trueCaller.data.models.Contact;

import java.util.ArrayList;


public class ContactRepositoryImpl implements   ContactRepository{

    ArrayList<Contact> contacts = new ArrayList<>();
    @Override
    public Contact save(Contact contact) {
        if(contact.getId() != 0)
        contact.setId(contacts.size()+1);
        contacts.add(contact);
        return contact;
    }

    @Override
    public Contact findById(int id) {
        return contacts.get(id - 1);
    }

    @Override
    public Contact findByLastName(String lastName)  {
        for (Contact contact: contacts) {
            if(contact.getLastName().equals(lastName)){
                return contact;
            }

        }
        throw new NoContactException("contact not found");
    }


    @Override
    public Contact deleteContact(Contact contact) {
        contacts.remove(contact);

        return contact;
    }

    @Override
    public Contact update(Contact contact) {
        contacts.set(contact.getId() - 1, contact);
        return contact;
    }

    @Override
    public Contact findByPhoneNumber(String phoneNumber) {
        for(Contact contact: contacts){
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;

            }
        }
        throw new NoContactException("contact not found");
    }


    @Override
    public int count() {
        return contacts.size();
    }

    @Override
    public Contact findByFirstName(String firstName) {
        for (Contact contact: contacts){
            if (contact.getPhoneNumber().equals(firstName)) {
                return contact;
            }
        }

        throw new NoContactException("contact not found");
    }
}
