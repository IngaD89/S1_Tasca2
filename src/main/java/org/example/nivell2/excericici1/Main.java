package org.example.nivell2.excericici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int option = 0;

        do {
            System.out.println("""
                    -----------------------\s
                    Escoge una opción:\s
                    1. Introducir byte\s
                    2. Introducir int\s
                    3. Introducir float\s
                    4. Introducir double\s
                    5. Introducir char\s
                    6. Introducir String\s
                    7. Introducir boolean\s
                    8. Salir del programa\s
                    """
            );
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){

                case 1:
                    try {
                        Entry.readByte("Introduce un byte");
                    }catch (InputMismatchException e){
                        System.out.println("Error: Byte válido es entre -128 y 127");
                    }
                    break;
                case 2:
                    try {
                        Entry.readInt("Introduce un Int");
                    }catch (InputMismatchException e){
                        System.out.println("Error: Int válido es entre –2,147,483,648 y 2,147,483,647");
                    }
                    break;
                case 3:
                    try {
                        Entry.readFloat("Introduce un Float");
                    }catch (InputMismatchException e){
                        System.out.println("Error: Float válido es separado por ',' ");
                    }
                    break;
                case 4:
                    try {
                        Entry.readDouble("Introduce un Double");
                    }catch (InputMismatchException e){
                        System.out.println("Error: Double válido es separado por ',' ");
                    }
                    break;
                case 5:
                    try {
                        Entry.readChar("Introduce un caracter");
                    }catch (CharLengthException e){
                        System.out.println("Error: Formato inválido, introduce una sola letra");
                    }
                    break;
                case 6:
                    try{
                        Entry.readString("Introduce String");
                    } catch (EmptyTextException e){
                        System.out.println("Error: Texto no puede ser vacio");
                    }
                    break;
                case 7:
                    try {
                        Entry.readBoolean("Introduce Si o No");
                    } catch (IncorrectDataException e){
                        System.out.println("Respuesta incorrecta. Debes responder Sí o No");
                    }
                    break;
                case 8:
                    System.out.println("Vuelva pronto");
                    break;
            }

        }while (option != 8);

    }
}
