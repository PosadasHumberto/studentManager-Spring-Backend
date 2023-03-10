package org.humberto.studentmanagerspringbackend.exceptions;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {

        super(message);
    }
}
