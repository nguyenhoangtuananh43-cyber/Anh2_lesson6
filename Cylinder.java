package LopTron;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter và Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }


    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() +
                ", color=" + getColor() +
                ", height=" + height +
                ", area=" + String.format("%.2f", getArea()) +
                ", volume=" + String.format("%.2f", getVolume()) + "]";
    }

}
