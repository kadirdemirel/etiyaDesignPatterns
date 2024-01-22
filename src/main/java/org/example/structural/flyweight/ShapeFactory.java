package org.example.structural.flyweight;

import java.awt.*;
import java.util.HashMap;

public class ShapeFactory {

    private static HashMap<Color,Circle> circleList = new HashMap<Color,Circle>();
    public static Circle getCircle(Color color)
    {
        // bu renkten bir instance varsa, yeni oluşturma
        Circle circle = circleList.get(color);

        if(circle==null)
        {
            circle = new Circle(color);
            circleList.put(color,circle);
            System.out.println("Var olmadığı için yeni bir instance oluştu +24 byte.");
        }
        return circle;
    }
}