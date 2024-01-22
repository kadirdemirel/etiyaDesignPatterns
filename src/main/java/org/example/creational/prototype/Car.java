package org.example.creational.prototype;

public class Car implements Cloneable {
    private Brand brand;
    private String model;
    private int year;
    private String color;

    @Override
    protected Car clone() {
        // Deep Copy => Derin
        // Shallow Copy => Yüzeysel
        try{
            Car car = (Car)super.clone();
            car.brand = this.brand.clone();
            return car;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Car(Brand brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
