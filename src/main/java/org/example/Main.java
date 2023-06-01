package org.example;

//1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс Торговый Автомат и реализовать перегруженный
// метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
//3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
//4. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре


public class Main {

    public static void main(String[] args) {

        Vending vending = new FruitVending();

        Product product1 = new Apple("Apple", 10, 1L);
        Product product2 = new Orange("Orange", 12, 2L);
        Product product3 = new Banana("Banana", 13, 3L);


        vending.addProducts(product1);
        vending.addProducts(product2);
        vending.addProducts(product3);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Orange"));
        System.out.println(vending.getProduct("Banana"));

        System.out.println(vending.getProduct(1L));
        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(5L));

        vending = new CoffeVending();

        Product drink1 = new Espresso("Espresso", 40, 1L, 70);
        Product drink2 = new Amerikano("Amerikano", 100, 2L, 100);

        vending.addProducts(drink1);
        vending.addProducts(drink2);

        System.out.println(vending.getProduct("Espresso"));
        System.out.println(vending.getProduct("Amerikano"));


    }

}

