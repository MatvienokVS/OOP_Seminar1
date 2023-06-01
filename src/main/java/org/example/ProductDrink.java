package org.example;

public class ProductDrink extends Product {

    private int temp;


    public ProductDrink(String kind, double price, long id, int temp) {
        super(kind, price, id);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
    this.temp = temp;
    }

}
