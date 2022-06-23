package africa.semicolon.trueCaller.data.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@RequiredArgsConstructor
@NoArgsConstructor
@Document("Contacts")
public class Contact {
        @Id
        private String id;
        @NonNull
        private String firstName;
        @NonNull
        private String lastName;
        @NonNull
        private String phoneNumber;

}

