package data.models;

import lombok.Data;

@Data
public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;

}


