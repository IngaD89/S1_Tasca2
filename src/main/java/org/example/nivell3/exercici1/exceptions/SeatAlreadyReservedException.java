package org.example.nivell3.exercici1.exceptions;

public class SeatAlreadyReservedException extends Exception{
    public SeatAlreadyReservedException() {
        super("Seat already reserved");
    }
}
