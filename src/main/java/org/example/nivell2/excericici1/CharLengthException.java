package org.example.nivell2.excericici1;

public class CharLengthException extends Exception{
    public CharLengthException() {
        super("Character length can't be more then 1 letter");
    }
}
