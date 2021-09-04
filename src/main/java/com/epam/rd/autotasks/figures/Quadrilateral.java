package com.epam.rd.autotasks.figures;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

class Quadrilateral extends Figure{

    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;
    private final Segment ab;
    private final Segment bc;
    private final Segment cd;
    private final Segment da;
    private final Segment ac;
    private final Segment bd;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        ab = new Segment(a, b);
        bc = new Segment(b, c);
        cd = new Segment(c, d);
        da = new Segment(d, a);
        ac = new Segment(a, c);
        bd = new Segment(b, d);
    }

    @Override
    public double area() {
        return new Triangle(a, b, c).area() + new Triangle(a, d, c).area();
    }

    @Override
    public String pointsToString() {
        return a.toString() + b.toString() + c.toString() + d.toString();
    }

    @Override
    public Point leftmostPoint() {

        double[] points = new double[]{
            a.getX(),
            b.getX(),
            c.getX(),
            d.getX()
        };

        Arrays.sort(points);

        if (a.getX() == points[0]) return a;
        if (b.getX() == points[0]) return b;
        if (c.getX() == points[0]) return c;

        return d;

    }
}
