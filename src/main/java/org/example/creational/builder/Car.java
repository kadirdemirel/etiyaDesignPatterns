package org.example.creational.builder;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int horsePower;

    public Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.horsePower = builder.horsePower;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }

    public static class Builder {
        private String brand;
        private String model;
        private int year;
        private String color;
        private int horsePower;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder year(int year) {
            this.year = year;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder horsePower(int horsePower) {
            this.horsePower = horsePower;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
