package com.csc205.project2;

public class Cube extends ThreeDimensionalShape {

    private double side;

    public Cube() {
        super();
        this.side = 0.0;
    }

    public Cube(double side) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double surfaceArea() {
        return 6.0 * Math.pow(side, 2);
    }

    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("side=").append(side);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
