package org.example.nivell1.exercici1;

public class EmptySaleException extends Exception{

    public EmptySaleException() {
        super("Per fer una venda primer has d’afegir productes");
    }
}
