package TrienKhai;

public class Rectanglebe implements Resizeable {
    private double width;
    private double height;

    public Rectanglebe() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectanglebe(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        this.width += this.width * percent / 100;
        this.height += this.height * percent / 100;
    }

    @Override
    public String toString() {
        return String.format("Rectangle{width=%.2f, height=%.2f, area=%.2f}", width, height, getArea());
    }
}
