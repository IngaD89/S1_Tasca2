package org.example.nivell1.exercici1;

public class Main {
    public static void main(String[] args) {

        Sales sales = new Sales();
        Product product = new Product("producto 1", 20);
        Product product2 = new Product("producto 2", 40);

       // sales.setProducts(product);
       // sales.setProducts(product2);

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
            System.out.println(e.getMessage());
        }
    }
}