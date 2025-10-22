package CacLopHinhHoc;

public class HinhTron extends DoiTuongHinhHoc {
    private double radius;

    public HinhTron(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
