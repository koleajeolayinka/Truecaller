package africa.semicolon.trueCaller.service;

import africa.semicolon.trueCaller.data.models.Contact;

public interface ContactService {

    void addContact(String firstName, String lastName, String phoneNumber, boolean DeleteId);

    Contact findById(int i);
}
