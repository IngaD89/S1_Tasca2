package org.example.nivell2.excericici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entry {
    static private final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String msg) throws InputMismatchException {
        scanner.nextLine();
        byte number = 0;
        System.out.println(msg);
        number = scanner.nextByte();
        return number;
    }

    public static int readInt(String msg) throws InputMismatchException {
        scanner.nextLine();
        int number = 0;
        System.out.println(msg);
        number = scanner.nextInt();
        System.out.println("Int introducido es " + number);
        return number;
    }

    public static float readFloat(String msg) throws InputMismatchException {
        scanner.nextLine();
        float number = 0;
        System.out.println(msg);
        number = scanner.nextFloat();
        System.out.println("Float introducido es " + number);
        return number;
    }

    public static double readDouble(String msg) throws InputMismatchException {
        scanner.nextLine();
        double number = 0;
        System.out.println(msg);
        number = scanner.nextDouble();
        System.out.println("Double introducido es " + number);
        return number;
    }

    public static char readChar(String msg) throws CharLengthException {
        scanner.nextLine();
        char letter = ' ';
        String character;

        System.out.println(msg);
        character = scanner.next();

        if (character.length() > 1) {
            throw new CharLengthException();
        } else {
            letter = character.charAt(0);
            System.out.println("La letra introducida es " + letter);
        }

        return letter;
    }

    public static String readString(String msg) throws EmptyTextException {
        scanner.nextLine();

        String text = "";
        System.out.println(msg);
        text = scanner.nextLine();

        if (text.length() == 0) {
            throw new EmptyTextException();
        }
        System.out.println("Texto introducido es: " + text);
        return text;
    }

    public static boolean readBoolean(String msg) throws IncorrectDataException {
        scanner.nextLine();

        char letter = ' ';
        boolean trueOFalse = false;

        System.out.println(msg);
        letter = scanner.next().charAt(0);

        if (letter == 's' || letter == 'S') {
            trueOFalse = true;
            System.out.println("Boolean iguala a true");
        } else if (letter == 'n' || letter == 'N') {
            trueOFalse = false;
            System.out.println("Boolean iguala a false");
        } else {
            throw new IncorrectDataException();
        }
        return trueOFalse;
    }
}
