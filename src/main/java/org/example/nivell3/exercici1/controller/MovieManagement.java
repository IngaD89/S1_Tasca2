package org.example.nivell3.exercici1.controller;

import org.example.nivell3.exercici1.exceptions.*;
import org.example.nivell3.exercici1.models.Movie;
import org.example.nivell3.exercici1.models.MovieSeat;

import java.util.Iterator;
import java.util.Scanner;

public class MovieManagement {
    private final Scanner scanner = new Scanner(System.in);

    private Movie movie;

    public MovieManagement(Movie movie) {
        this.movie = movie;
    }

    public void menu(){
        int option;
        do {
            System.out.println("""
                    1.- Mostrar totes les butaques reservades.
                    2.- Mostrar les butaques reservades per una persona.
                    3.- Reservar una butaca.
                    4.- Anul·lar la reserva d’una butaca.
                    5.- Anul·lar totes les reserves d’una persona.
                    0.- Sortir.
                    """);
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){

                case 0:
                    System.out.println("Cerrando sesión");
                    break;
                case 1:
                    showAllSeats();
                    break;
                case 2:
                    showSeatPerUser();
                    break;
                case 3:
                    reserveSeat();
                    break;
                case 4:
                    cancelReserve();
                    break;
                case 5:
                    cancelReservesPerUser();
                    break;
            }

        }while (option != 0);
    }

    public void showAllSeats(){
        if (movie.getSeatManagement().getSeats().isEmpty()) {
            System.out.println("Aún no se ha reservado ningun asiento");
        } else {
            for (MovieSeat seat : movie.getSeatManagement().getSeats()) {
                System.out.println(seat);
            }
        }
    }
    public void showSeatPerUser(){
        System.out.println("Introduce nombre de usuario");
        String userName = scanner.nextLine();
        boolean found = false;

        for (MovieSeat seat : movie.getSeatManagement().getSeats()){
            if(seat.getUserName().equalsIgnoreCase(userName)){
                System.out.println(seat);
                found = true;
            }
        }
        if(!found){
            System.out.println("No se ha encontrado reservas para usuario " + userName);
        }
    }
    public void reserveSeat(){
        try {
            int row = insertRow();
            int seat = insertSeat();
            String userName = insertUser();
            MovieSeat movieSeat = new MovieSeat(row, seat, userName);
            movie.getSeatManagement().addSeat(movieSeat);
            System.out.println("Butaca ha sido reservada");
        } catch (IncorrectRowException e) {
            System.out.println("Error: numero de fila incorrecta");
        }catch (SeatAlreadyReservedException e){
            System.out.println("Error: asiento ocupado");
        } catch (IncorrectSeatException e){
            System.out.println("Error: numero de asiento incorrecto");
        }catch (IncorrectUserNameException e){
            System.out.println("Error: nombre de usuario no puede contener numeros");
        }
    }
    public void cancelReserve(){
        try {
            int row = insertRow();
            int seat = insertSeat();
            movie.getSeatManagement().deleteSeat(row, seat);
            System.out.println("La reserva ha sido cancelado");
        } catch (IncorrectRowException e){
            System.out.println("Error: numero de fila incorrecta");
        } catch (IncorrectSeatException e){
            System.out.println("Error: numero de asiento incorrecto");
        } catch (FreeSeatException e){
            System.out.println("Error: no se puede cancelar asiento no reservado");
        }
    }
    public void cancelReservesPerUser() {
        try {
            String userName = insertUser();
            Iterator<MovieSeat> iterator = movie.getSeatManagement().getSeats().iterator();

            while (iterator.hasNext()) {
                MovieSeat seat = iterator.next();
                if (seat.getUserName().equalsIgnoreCase(userName)) {
                    iterator.remove();
                }
            }
            System.out.println("Los aasientos del usuario han sido cancelado");
        }catch (IncorrectUserNameException e){
            System.out.println("Error al cancelar reservas de usuario");
        }
    }

    private String insertUser() throws IncorrectUserNameException {
        System.out.println("Introduce nombre de usuario");
        String userName = scanner.nextLine();

        if(!userName.matches("[a-zA-z]+")){
            throw new IncorrectUserNameException();
        }
        return userName;
    }

    private int insertRow() throws IncorrectRowException {
        System.out.println("Introduce numero de fila");
        int row = scanner.nextInt();
        scanner.nextLine();
        if(row < 1 || row > movie.getTotalRow()){
            throw new IncorrectRowException();
        }
        return row;
    }

    private int insertSeat() throws IncorrectSeatException {
        System.out.println("Introduce numero de asiento");
        int seat = scanner.nextInt();
        scanner.nextLine();
        if(seat < 1 || seat > movie.getSeatForRow()){
            throw new IncorrectSeatException();
        }
        return seat;
    }


}
