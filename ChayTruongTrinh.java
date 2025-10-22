package CacLopHinhHoc;

public class ChayTruongTrinh {
    public static void main(String[] args) {
        DoiTuongHinhHoc[] shapes = new DoiTuongHinhHoc[3];
        shapes[0] = new HinhTron(3.0);
        shapes[1] = new HinhChuNhat(4.0, 5.0);
        shapes[2] = new HinhTron(6.0);

        for (DoiTuongHinhHoc shape : shapes) {
            System.out.println("Diện tích: " + shape.getArea());
            if (shape instanceof ToMau) {
                ((ToMau) shape).howToColor();
            }
            System.out.println("----------------------------");
        }
    }
}
