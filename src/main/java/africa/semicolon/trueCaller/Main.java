package africa.semicolon.trueCaller;

import africa.semicolon.trueCaller.controllers.ContactController;
import africa.semicolon.trueCaller.data.repositories.ContactRepository;
import africa.semicolon.trueCaller.service.ContactService;
import africa.semicolon.trueCaller.service.ContactServicesImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Main {


//    private ContactRepository contactRepository;
//    public ContactService contactService = new ContactServicesImpl(contactRepository);
//    public static final ContactController contactController = new ContactController();
//    public static Scanner scanner = new Scanner(System.in);
//
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
//
//
//        String Display = """
//                 WELCOME TO TRUE CALLER APPLICATION
//                 PRESS 1 <>-> CREATE CONTACT
//                 PRESS 2 <>-> SEARCH CONTACT
//                 PRESS 3 <>-> DELETE CONTACT
//                """;
//        System.out.println(Display);
//        switch (Display.charAt(0)) {
//            case '1' -> CreateContact();
//            case '2' -> SearchContact();
//            case '3' -> DeleteContact();
//            default -> DisplayPrompt("ENTER CORRECT INPUT");
//        }
//
//
//
//    }
//
//    private static String DisplayPrompt(String input) {
//        input = scanner.nextLine();
//
//        return input;
//    }
//
//    private static void DeleteContact() {
//    }
//
//    private static void SearchContact() {
//    }
//
//    private static void CreateContact() {
//        String firstName = DisplayPrompt("Enter first name");
//        String lastName = DisplayPrompt("Enter last name");
//        String phoneNumber = DisplayPrompt("Enter phone Number");
//        String result = ContactController.addContact(firstName, lastName, phoneNumber);

    }


}
