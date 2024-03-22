package com.polygon.controller;
import com.polygon.model.base.Polygon;

public class Controller {
    public void processPolygon(Polygon polygon) {
        System.out.println("The Height of this " + polygon + " is " + precisionValue(polygon.getHeight()));
        System.out.println("The Perimeter of this " + polygon + " is " + precisionValue(polygon.getPerimeter()));
        System.out.println("The Area of this " + polygon + " is " + precisionValue(polygon.getArea()));
        System.out.println("The Interior Angle of this " + polygon + " is " +
                precisionValue(polygon.getInteriorAngle()));
    }

    private String precisionValue(double value) {
        return String.format("%.2f", value);
    }
}
