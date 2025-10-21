package TrienKhai;

public class Circlebe implements Resizeable {
    private double radius;

    public Circlebe() {
        this.radius = 1.0;
    }

    public Circlebe(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }
    @Override
    public String toString() {
        return String.format("Circle{radius=%.2f, area=%.2f}", radius, getArea());
    }
}
