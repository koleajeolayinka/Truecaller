package africa.semicolon.trueCaller.data.models;

import lombok.*;


@Data
public class Contact {
        private int id;
        @NonNull
        private String firstName;
        @NonNull
        private String lastName;
        @NonNull
        private String phoneNumber;
        @NonNull
        private boolean DeleteId;

}
