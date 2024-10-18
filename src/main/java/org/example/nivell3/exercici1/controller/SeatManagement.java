package org.example.nivell3.exercici1.controller;

import org.example.nivell3.exercici1.exceptions.FreeSeatException;
import org.example.nivell3.exercici1.exceptions.SeatAlreadyReservedException;
import org.example.nivell3.exercici1.models.MovieSeat;

import java.util.ArrayList;

public class SeatManagement {
    private ArrayList<MovieSeat> seats;

    public SeatManagement() {
        this.seats = new ArrayList<>();
    }

    public ArrayList<MovieSeat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<MovieSeat> seats) {
        this.seats = seats;
    }

    public void addSeat(MovieSeat movieSeat) throws SeatAlreadyReservedException {
        if(findSeat(movieSeat.getRowNum(), movieSeat.getSeatNum()) != -1){
            throw new SeatAlreadyReservedException();
        }

        this.seats.add(movieSeat);
    }
    public void deleteSeat(int rowNum, int seatNum) throws FreeSeatException {
        int seat = findSeat(rowNum, seatNum);
        if(seat == -1){
            throw new FreeSeatException();
        } else {
            seats.remove(seat);
        }
    }

    private int findSeat(int rowNum, int seatNum){
        for(int i = 0; i < seats.size(); i++){
            if(seats.get(i).getRowNum() == rowNum
            && seats.get(i).getSeatNum() == seatNum
            ){
                return i;
            }
        }
        return -1;
    }


}
