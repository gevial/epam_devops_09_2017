package com.epam.lesson7;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 3);
        Rectangle r2 = new Rectangle(2, 3, 10, 100);
        System.out.println(r1);
        System.out.println(r2.calcSquare());
    }
}

abstract class GeoShape implements Comparable<GeoShape>, CalculableSquare {
    private int x;
    private int y;

    public GeoShape() {
        this.x = 0;
        this.y = 0;
    }

    public GeoShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "GeoShape {" + x + ", " + y + "}";
    }
}

class Rectangle extends GeoShape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height, int x, int y) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcSquare() {
        return Math.PI;
    }

    @Override
    public int compareTo(GeoShape o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle {" + super.toString() + " - " + width + "x" + height + "}";
    }
}

interface CalculableSquare {
    double calcSquare();
}
