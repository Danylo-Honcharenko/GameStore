package org.coursesjava.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Error {
    NO_EXIST("This menu item does not exist!"),
    NOT_CREDITED("Money was not credited!"),
    NOT_CREATED_ACCOUNT("Error created account!"),
    NOT_CREATED_USER("The user was not created!"),
    USER_NOT_FOUND("User is not found!");

    private final String message;
}
