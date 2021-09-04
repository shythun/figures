package com.epam.rd.autotasks.figures;

import java.text.Format;

class Circle extends Figure{

    private final Point center;
    private final double radius;

    Circle(Point center, double radius) {

        if (radius == 0) throw new IllegalArgumentException("Radius should be > 0");
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String pointsToString() {
        return "(" + center.getX() + "," + center.getY() + ")";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "[" + "(" + center.getX() + "," + center.getY() + ")" + radius + "]";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(center.getX() - radius, center.getY());
    }
}
