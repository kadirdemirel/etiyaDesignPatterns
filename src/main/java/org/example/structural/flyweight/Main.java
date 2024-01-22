package org.example.structural.flyweight;

import java.awt.*;

public class Main {
    private static final Color colors[] = {Color.BLACK, Color.blue, Color.GRAY, Color.green};
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setY(getRandomCoordinate());
            circle.setX(getRandomCoordinate());
            circle.draw();
        }
        // 1.000.000 instance => 24.000.000 bytes
        // 4 instance => 72 bytes
    }
    private static Color getRandomColor() {
        int randomInd = (int)(Math.random() * colors.length);
        return colors[randomInd];
    }
    private static int getRandomCoordinate() {
        return (int)(Math.random() * 100);
    }
}