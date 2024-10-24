package org.example.nivell2.excericici1.exceptions;

public class CharLengthException extends Exception{
    public CharLengthException() {
        super("La longitud de los caracteres no puede ser mayor a 1 letra");
    }
}
