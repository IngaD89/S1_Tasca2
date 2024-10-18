package org.example.nivell3.exercici1.exceptions;

public class IncorrectSeatException extends Exception{
    public IncorrectSeatException() {
        super("Seat number does not match any existing");
    }
}
