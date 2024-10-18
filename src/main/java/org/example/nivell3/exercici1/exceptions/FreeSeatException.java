package org.example.nivell3.exercici1.exceptions;

public class FreeSeatException extends Exception{
    public FreeSeatException() {
        super("Seat is already free");
    }
}
