package org.example.nivell3.exercici1.models;

import org.example.nivell3.exercici1.controller.MovieManagement;
import org.example.nivell3.exercici1.controller.SeatManagement;

import java.util.Scanner;

public class Movie {
    private int totalRow;
    private int seatForRow;
    private SeatManagement seatManagement;
    private MovieManagement movieManagement;

    public Movie() {
        this.seatManagement = new SeatManagement();
        this.movieManagement = new MovieManagement(this);
        requestInitialData();
    }

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        this.totalRow = totalRow;
    }

    public int getSeatForRow() {
        return seatForRow;
    }

    public void setSeatForRow(int seatForRow) {
        this.seatForRow = seatForRow;
    }

    public SeatManagement getSeatManagement() {
        return seatManagement;
    }

    public void setSeatManagement(SeatManagement seatManagement) {
        this.seatManagement = seatManagement;
    }

    public MovieManagement getMovieManagement() {
        return movieManagement;
    }

    public void setMovieManagement(MovieManagement movieManagement) {
        this.movieManagement = movieManagement;
    }

    public void requestInitialData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el nombre de files: ");
        this.totalRow = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introdueix el nombre de seients per fila: ");
        this.seatForRow = scanner.nextInt();
        scanner.nextLine();
    }
    public void start(){
        movieManagement.menu();
    }

}
