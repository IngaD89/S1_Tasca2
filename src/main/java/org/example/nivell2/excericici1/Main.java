package org.example.nivell2.excericici1;

import java.util.Scanner;

public class Main {
    private static final EntryHandler ENTRY_HANDLER = new EntryHandler();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

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

            switch (option) {
                case 1 -> ENTRY_HANDLER.handleByte();
                case 2 -> ENTRY_HANDLER.handleInt();
                case 3 -> ENTRY_HANDLER.handleFloat();
                case 4 -> ENTRY_HANDLER.handleDouble();
                case 5 -> ENTRY_HANDLER.handleChar();
                case 6 -> ENTRY_HANDLER.handleString();
                case 7 -> ENTRY_HANDLER.handleBoolean();
                case 8 -> System.out.println("Vuelva pronto");
                default -> System.out.println("Debes escoger una opción válida entre 1 y 8");
            }

        } while (option != 8);

    }


}
