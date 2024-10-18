package org.example.nivell3.exercici1.exceptions;

public class IncorrectRowException extends Exception {
    public IncorrectRowException() {
        super("Row number does not match any existent");
    }
}
