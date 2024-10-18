package org.example.nivell3.exercici1.exceptions;

public class IncorrectUserNameException extends Exception{
    public IncorrectUserNameException() {
        super("Invalid user name format");
    }
}
