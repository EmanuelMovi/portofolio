package com.codecool.model;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailData {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String message;

    public String getfirstName() {
        return this.firstName;
    }

    public String getlastName() {
        return this.lastName;
    }
}