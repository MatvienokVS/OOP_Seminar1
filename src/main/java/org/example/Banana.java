package org.example;

public class Banana extends Product {

    public Banana(String kind, double price, Long id) {
        super(kind, price, id);
    }

    @Override
    public String toString() {
        return String.format("У банана: %s, %s, %s", getKind(), getPrice(), getId());
    }
}
