package org.example;

public class Espresso extends ProductDrink {

    public Espresso(String kind, double price, Long id, int temp) {
        super(kind, price, id, temp);
    }

    @Override
    public String toString() {
        return String.format("У Эспрессо: %s, %s, %s, %s", getKind(), getPrice(), getId(), getTemp());
    }
}
