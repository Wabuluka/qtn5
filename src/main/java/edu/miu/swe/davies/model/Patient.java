package edu.miu.swe.davies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Patient {
    private String firstName;
    private String lastName;
    private String contact;
    private String email;
    private String mailingAddress;
    private String dateOfBirth;
}
