package org.example;

public class Amerikano extends ProductDrink {

    public Amerikano(String kind, double price, Long id, int Temp) {
        super(kind, price, id);
    }

    @Override
    public String toString() {
        return String.format("У Эспрессо: %s, %s, %s, %s", getKind(), getPrice(), getId(), getTemp());
    }
}
