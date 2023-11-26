package org.coursesjava.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {
    USER_CREATE_SUCCESSFULLY("User create successfully!"),
    ACCOUNT_CREATED_SUCCESSFULLY("Account created successfully!");
    private final String message;
}
