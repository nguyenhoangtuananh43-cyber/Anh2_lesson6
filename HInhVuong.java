package CacLopHinhHoc;

public class HInhVuong extends DoiTuongHinhHoc implements ToMau {
    private double side;

    public HInhVuong(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void howToColor() {
        System.out.println("Tô màu cả 4 mặt ");
    }
}
