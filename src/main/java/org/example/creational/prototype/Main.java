package org.example.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Brand(1,"Alfa Romeo"),"ABC",2023,"Kırmızı");
        Car car2 =  car.clone(); //new Car(car.getBrand(), car.getModel(), car.getYear(), "Siyah");

        System.out.println(car);
        System.out.println(car2);

        car2.getBrand().setName("Deneme");

        System.out.println(car.getBrand().getName());
        System.out.println(car2.getBrand().getName());
    }

}
