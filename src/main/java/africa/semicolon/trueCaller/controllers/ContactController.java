package africa.semicolon.trueCaller.controllers;

import africa.semicolon.trueCaller.data.repositories.ContactRepository;
import africa.semicolon.trueCaller.service.ContactService;
import africa.semicolon.trueCaller.service.ContactServicesImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/app")
public class ContactController {
    private ContactRepository contactRepository;
    private ContactService contactService = new ContactServicesImpl(contactRepository);

    @PostMapping("/contact")
    public static String addContact(@RequestBody RequestDto requestDto) {
    ContactService.addContact(requestDto.getFirstName(), requestDto.getLastName(), requestDto.getPhoneNumber());
        return "add Successfully";

    }

    public static String addContact(String firstName, String lastName, String phoneNumber) {
        return firstName;
    }

    @GetMapping("/contact/{firstName}")
    public String findByFirstName(@PathVariable String firstName) {
        return contactService.findByFirstName(firstName).toString();
    }

    @GetMapping("/")
    public String dot() {
        return "welcome to true - caller";
    }
}


