package com.company;

import java.text.BreakIterator;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Fuel fuel = new Fuel("Бензин", 7);
        Category objectA = new Category(Color.BLACK, fuel, "Седан", 1200);
        System.out.println(objectA.getInfo());
        objectA.drawAuto('B', "Легковой");

        Fuel fuel1 = new Fuel("Дизель", 10);
        Brand objectB = new Brand(Color.RED, fuel1, "Кабриолет", 1500, "BMW", 6, 2010, 10000);
        System.out.println(objectB.getInfo1());
        objectB.drawAuto("Легковой", 'B');

        Fuel fuel2 = new Fuel("Electro", 0);
        Brand objectC = new Brand(Color.WHITE, fuel2, "Хетчбэк", 1400, "Tesla", 0, 2015, 1000);
        System.out.println(objectC.getInfo2());
        objectC.drawAuto('B');

        System.out.printf("Копированные свойства\n");
        Brand copy=new Brand(objectC);
        objectC.copyBufer(objectB);
        System.out.println(objectC.getInfo2());
    }
}
