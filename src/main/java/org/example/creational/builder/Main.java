package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.setBrand("bmw");
//        car.setColor("siyah");
//        car.setYear(2023);
//
//        Car car2 = new Car("bmw","xx",2023,"siyah",500);

        Car car = new Car.Builder().brand("bmw").color("siyah").horsePower(500).build();
        System.out.println(car.toString());
    }

}
