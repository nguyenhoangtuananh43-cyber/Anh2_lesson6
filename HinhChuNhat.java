package CacLopHinhHoc;

public class HinhChuNhat extends DoiTuongHinhHoc {
    private double width;
    private double height;

    public HinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
