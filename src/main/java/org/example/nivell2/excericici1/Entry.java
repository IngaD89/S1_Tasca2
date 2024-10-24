package org.example.nivell2.excericici1;

import org.example.nivell2.excericici1.exceptions.CharLengthException;
import org.example.nivell2.excericici1.exceptions.EmptyTextException;
import org.example.nivell2.excericici1.exceptions.IncorrectDataException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
     public static final Scanner scanner = new Scanner(System.in);

    public  void readByte(String msg) throws InputMismatchException {
        System.out.println(msg);
        byte number = scanner.nextByte();
        System.out.println("Byte introducido es " + number);
    }

    public  void readInt(String msg) throws InputMismatchException {
        System.out.println(msg);
        int number = scanner.nextInt();
        System.out.println("Int introducido es " + number);
    }

    public  void readFloat(String msg) throws InputMismatchException {
        System.out.println(msg);
        float number = scanner.nextFloat();
        System.out.println("Float introducido es " + number);
    }

    public  void readDouble(String msg) throws InputMismatchException {
        System.out.println(msg);
        double number = scanner.nextDouble();
        System.out.println("Double introducido es " + number);
    }

    public  void readChar(String msg) throws CharLengthException {
        char letter;
        String character;

        System.out.println(msg);
        character = scanner.next();

        if (character.length() > 1) {
            throw new CharLengthException();
        } else {
            letter = character.charAt(0);
            System.out.println("La letra introducida es " + letter);
        }

    }

    public  void readString(String msg) throws EmptyTextException {

        String text;
        System.out.println(msg);
        text = scanner.nextLine();

        if (text.length() == 0) {
            throw new EmptyTextException();
        }
        System.out.println("Texto introducido es: " + text);
    }

    public  void readBoolean(String msg) throws IncorrectDataException {
        char letter = ' ';

        System.out.println(msg);
        letter = scanner.next().charAt(0);

        if (letter == 's' || letter == 'S') {
            System.out.println("Boolean iguala a true");
        } else if (letter == 'n' || letter == 'N') {
            System.out.println("Boolean iguala a false");
        } else {
            throw new IncorrectDataException();
        }
    }
}
