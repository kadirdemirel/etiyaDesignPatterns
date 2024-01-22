package org.example.structural.flyweight;

import java.awt.*;

public class Circle implements Shape
{
    private int x;
    private int y;
    private Color color;

    public Circle(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Circle(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Ekranın " + x + "," + y + " koordinatlarına " + color.toString() + " renginde circle çizildi.");
    }
}