package com.polygon.model.sub;
import com.polygon.model.base.Polygon;

public class Hexagon extends Polygon {
    private final double equalSides;

    public Hexagon(double equalSides) {
        super(6);
        this.equalSides = equalSides;
    }

    @Override
    public double getArea() {
        return(3 * (Math.sqrt(3) * Math.pow(equalSides, 2))) / 2;
    }

    @Override
    public double getHeight() {
        // 1.732 or square root of 3
        // Height is the Short Diagonal
        return equalSides * Math.sqrt(3);
    }

    @Override
    public double getPerimeter() {
        return 6 * equalSides;
    }
}
