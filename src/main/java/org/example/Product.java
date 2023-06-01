package org.example;

public abstract class Product {

    private String kind;
    private double price;
    private long id;

    public Product(String kind, double price, long id) {
        this.kind = kind;
        this.price = price;
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
