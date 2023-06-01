package org.example;

public class ProductDrink extends Product {

    private int Temp;


    public ProductDrink(String kind, double price, long id) {
        super(kind, price, id);

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
