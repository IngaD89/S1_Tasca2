package org.example.nivell1.exercici1;

import java.util.ArrayList;

public class Sales {
    private ArrayList<Product> products;
    private double totalPrice;

    public Sales() {
        this.products = new ArrayList<>();
        totalPrice = 0;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public  double calculateTotal() throws EmptySaleException {
        if(products.isEmpty()){
            throw new EmptySaleException();
        } else {
            totalPrice = 0;
            for(Product product : products){
                this.totalPrice += product.getPrice();
            }
        }
        return this.totalPrice;
    }
}
