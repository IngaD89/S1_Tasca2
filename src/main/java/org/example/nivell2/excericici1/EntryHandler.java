package org.example.nivell2.excericici1;

import org.example.nivell2.excericici1.exceptions.CharLengthException;
import org.example.nivell2.excericici1.exceptions.EmptyTextException;
import org.example.nivell2.excericici1.exceptions.IncorrectDataException;

import java.util.InputMismatchException;

public class EntryHandler {

    private static final Entry ENTRY = new Entry();
    public void handleByte() {
        boolean isValid = false;

        while (!isValid) {
            try {
                ENTRY.readByte("Introduce un byte");
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "\nERROR: Byte válido es entre -128 y 127");
            } finally {
                Entry.scanner.nextLine();
            }
        }
    }

    public void handleInt() {
        boolean isValid = false;

        while (!isValid) {
            try {
                ENTRY.readInt("Introduce un Int");
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "\nERROR: Int válido es entre –2,147,483,648 y 2,147,483,647");
            } finally {
                Entry.scanner.nextLine();

            }
        }
    }

    public void handleFloat() {
        boolean isValid = false;
        while (!isValid) {
            try {
                ENTRY.readFloat("Introduce un Float");
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "\nERROR: Float válido es separado por ',' ");
            } finally {
                Entry.scanner.nextLine();

            }
        }
    }

    public void handleDouble() {
        boolean isValid = false;
        while (!isValid) {
            try {
                ENTRY.readDouble("Introduce un Double");
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "\nERROR: Double válido es separado por ',' ");
            } finally {
                Entry.scanner.nextLine();

            }
        }
    }

    public void handleChar() {
        boolean isValid = false;

        while (!isValid) {
            try {
                ENTRY.readChar("Introduce un caracter");
                isValid = true;
            } catch (CharLengthException e) {
                System.out.println(e.getMessage() + "\nERROR: Formato inválido, introduce una sola letra.");
            } finally {
                Entry.scanner.nextLine();
            }
        }
    }

    public void handleString() {
        boolean isValid = false;

        while (!isValid) {
            try {
                ENTRY.readString("Introduce String");
                isValid = true;
            } catch (EmptyTextException e) {
                System.out.println(e.getMessage() + "\nERROR: Texto no puede ser vacio");
            }
        }
    }

    public void handleBoolean() {
        boolean isValid = false;

        while (!isValid) {
            try {
                ENTRY.readBoolean("Introduce Si o No");
                isValid = true;
            } catch (IncorrectDataException e) {
                System.out.println(e.getMessage() + "\nERROR: Debes responder Sí o No.");
            }
        }
    }
}
