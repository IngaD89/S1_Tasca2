package org.example.nivell2.excericici1;

public class EmptyTextException extends Exception{
    public EmptyTextException() {
        super("Text can't be empty");
    }
}
