package africa.semicolon.trueCaller.data.repositories;

import africa.semicolon.trueCaller.data.models.Contact;
import africa.semicolon.trueCaller.Exception.NoContactException;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepository extends MongoRepository<Contact, String> {
    Contact save(Contact contact);
    int count();
    Contact findByFirstName(String firstName);
    Contact findById(int id);
    Contact findByLastName(String lastName) throws NoContactException;
    Contact deleteContact(Contact contact);
    Contact update(Contact contact);
    Contact findByPhoneNumber(String phoneNumber);


}
