package org.example.nivell1.exercici1;

public class Main {
    public static void main(String[] args) {

        Sales sales = new Sales();

        try {
            System.out.println(sales.calculateTotal());
        } catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }

        try {
            for(int i = 0; i <= sales.getProducts().size(); i++){
                System.out.println(sales.getProducts().get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: elemento que estas buscando no existe. " + e.getMessage());
        }
    }
}