package com.polygon.model.sub;
import com.polygon.model.base.Polygon;

public class Pentagon extends Polygon {
    private final double equalSides;

    public Pentagon(double equalSides) {
        super(5);
        this.equalSides = equalSides;
    }

    public double getArea() {
        double value = 5 * (5 + 2 * Math.sqrt(5));
        return .25 * Math.sqrt(value) * Math.pow(equalSides, 2);
    }

    @Override
    public double getHeight() {
        return equalSides * Math.sqrt(5 + 2 * Math.sqrt(5)) / 2;
    }

    @Override
    public double getPerimeter() {
        return 5 * equalSides;
    }

    @Override
    public String toString() {
        return "Pentagon";
    }
}
