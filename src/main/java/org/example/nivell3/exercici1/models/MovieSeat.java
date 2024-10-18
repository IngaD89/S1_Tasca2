package org.example.nivell3.exercici1.models;

public class MovieSeat {
    private int rowNum;
    private int seatNum;
    private String userName;


    public MovieSeat(int rowNum, int seatNum, String userName) {
        this.rowNum = rowNum;
        this.seatNum = seatNum;
        this.userName = userName;
    }

    public int getRowNum() {
        return rowNum;
    }

    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MovieSeat movieSeat = (MovieSeat) obj;
        return rowNum == movieSeat.rowNum && seatNum == movieSeat.seatNum;
    }


    @Override
    public String toString() {
        return "Fila: " + this.rowNum + ", Seient: " + this.seatNum + ", Persona: " + this.userName;
    }
}
