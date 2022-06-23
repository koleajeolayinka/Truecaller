package africa.semicolon.trueCaller.service;

import africa.semicolon.trueCaller.data.models.Contact;

public interface ContactService {


    static void addContact(String firstName, String lastName, String phoneNumber) {

    }


    Contact findById(int i);


    Contact findByFirstName(String firstName);
    Contact findByLastName(String lastName);
    Contact findByPhoneNumber(String phoneNumber);

    Contact update(Contact contact);
    void deleteContact(Contact contact);
    int count();
}
